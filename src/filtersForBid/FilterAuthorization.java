package filtersForBid;

import model.Ad;
import sessionsBidDB.AdM;
import sessionsBidDB.ConnectionBidDB;
import staticClass.TestIntr;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by DMalenkov on 24.02.2015.
 */
public class FilterAuthorization implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        //AbsApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        //AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        // =  ctx.getBean("test");
        TestIntr t = (TestIntr) org.springframework.web.context.ContextLoaderListener.getCurrentWebApplicationContext().getBean("test");
        System.out.println("Фильтр работает");
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String iPMashine = httpRequest.getRemoteAddr();
        ConnectionBidDB conBDB = new AdM();
        List<Ad> listAD = conBDB.getEntities("SELECT o FROM Ad o WHERE o.ip = :ip",
                "ip", iPMashine);
        System.out.println(listAD);
        if (!listAD.isEmpty()) {
            t.setAd(listAD.get(0));
            System.out.println(listAD.get(0).getFirstName());
            HttpServletResponse httpResponse = (HttpServletResponse) response;  // Мы не можем вызвать response.sendRedirect("login.jsp") так как нам нужен httpResponse, а не ServletResponse.
            httpResponse.sendRedirect("./helpDesk/createBidHD.xhtml");
        } else {
            HttpServletResponse httpResponse = (HttpServletResponse) response;  // Мы не можем вызвать response.sendRedirect("login.jsp") так как нам нужен httpResponse, а не ServletResponse.
            httpResponse.sendRedirect("./index.xhtml");
        }
    }

    @Override
    public void destroy() {

    }
}
