package managerMenu;

import model.Dogovora;
import model.IdKontragentov;
import model.ReestrIzdanii;
import org.primefaces.event.SelectEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sessionsBidDB.ConnectionBidDB;
import sessionsBidDB.DogovoraM;
import sessionsBidDB.IdKontragentovM;
import sessionsBidDB.ReestrIzdaniiM;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by DMalenkov on 15.12.2014.
 */
public class ManagerMenu {

    private List<IdKontragentov> spisokAgentov;
    private List<Dogovora> spisokDogovorov;
    private List<ReestrIzdanii> spisokIzdanii;
    private IdKontragentov buferAgent;
    private Dogovora dogovora;
    private ReestrIzdanii izdanii;
    private boolean showActionForIdKontrAgenta;
    private boolean showActionForDogovor;
    private boolean showActionForIzdanie;
    private int ribbonIndex;
    private String showingPage;
    private String showDialogPage;
    private String showActionForAgenti;
    private String previewPanel;
    private String bufferForShowDialogPage;

    @PostConstruct
    public void createClass() {
        showingPage = "/newsPage/news.xhtml";
        showDialogPage = "/newsPage/news.xhtml";
        bufferForShowDialogPage = "";
        ribbonIndex = 0;
        showActionForIdKontrAgenta = false;
        showActionForDogovor = false;
        showActionForIzdanie = false;
        dogovora = new Dogovora();
        izdanii = new ReestrIzdanii();
        ConnectionBidDB inter = new IdKontragentovM();
        spisokAgentov = inter.getEntities();
        inter = new DogovoraM();
        spisokDogovorov = inter.getEntities();
        inter = new ReestrIzdaniiM();
        spisokIzdanii = inter.getEntities();
        buferAgent = new IdKontragentov();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
//        InterfaceManagerMenu men = (InterfaceManagerMenu) ctx.getBean("mainBean");
//        System.out.println(" "+men.getNameBean());
    }

    //Метод отображения действий над контрагентом
    public void showAgenta(SelectEvent event) {
        buferAgent = (IdKontragentov) event.getObject();
        showActionForAgenti = "/ribbonElements/actionAgenti/actionAgenti.xhtml";
    }

    public void hideAgenta(SelectEvent event) {
        buferAgent = new IdKontragentov();
        showActionForAgenti = "";
    }

    //Метод отображения действий над договором
    public void showDogovor(SelectEvent event) {
        dogovora = (Dogovora) event.getObject();
        showActionForAgenti = "/ribbonElements/actionAgenti/actionDogovora.xhtml";
    }

    public void hideDogovor(SelectEvent event) {
        showActionForAgenti = "";
        dogovora = new Dogovora();
    }

    //Метод отображения действий над изданием
    public void showIzdanie(SelectEvent event) {
        showActionForAgenti = "/ribbonElements/actionAgenti/actionIzdanie.xhtml";
        izdanii = (ReestrIzdanii) event.getObject();
    }

    public void hideIzdanie(SelectEvent event) {
        showActionForAgenti = "";
        izdanii = new ReestrIzdanii();
    }

    //-----------------------------
    public void showPageBid() {
        System.out.println("Выключение");
        showActionForDogovor = false;
        showActionForIdKontrAgenta = false;
        showActionForIzdanie = false;
        ribbonIndex = 0;
        showingPage = "/spisokBid/listBid.xhtml";
    }

    public void showPageCreateBid() {
        showActionForDogovor = false;
        showActionForIdKontrAgenta = false;
        showActionForIzdanie = false;
        ribbonIndex = 0;
        showingPage = "/calculatorPage/createBid.xhtml";
    }

    //Изменение страницы которая показывается в центральной части
    public void showPageAgenti() {
        showActionGeneral();
        showingPage = "/panelKontragenti/kontragenti.xhtml";
        bufferForShowDialogPage = showingPage;
    }

    public void showPageAd() {
        //    showActionGeneral();
        showingPage = "/ad/showAll.xhtml";
        bufferForShowDialogPage = showingPage;
    }

    public void showPageDogovora() {
        showActionGeneral();
        showingPage = "/panelKontragenti/dogovors.xhtml";
        bufferForShowDialogPage = showingPage;
    }

    public void showPageIzdanie() {
        showActionGeneral();
        showingPage = "/panelKontragenti/izdaniya.xhtml";
        bufferForShowDialogPage = showingPage;
    }


    public void preShowPageCreateDogovor() {
        dogovora = new Dogovora();
        showPageCreateDogovor();
    }

    public void showPageCreateDogovor() {
        showActionGeneral();
        showActionForAgenti = "/ribbonElements/actionAgenti/actionCreateDogovora.xhtml";
        showingPage = "/listSCEAgenti/createDogovors.xhtml";
    }

    public void preShowPageCreateAgent() {
        buferAgent = new IdKontragentov();
        showPageCreateAgent();
    }


    public void showPageCreateAgent() {
        showActionGeneral();
        showActionForAgenti = "/ribbonElements/actionAgenti/actionCreateAgenti.xhtml";
        showingPage = "/listSCEAgenti/createAgents.xhtml";
    }

    public void preShowPageCreateIzdanie() {
        izdanii = new ReestrIzdanii();
        showPageCreateIzdanie();
    }

    public void showPageCreateIzdanie() {
        showActionGeneral();
        showActionForAgenti = "/ribbonElements/actionAgenti/actionCreateIzdanie.xhtml";
        showingPage = "/listSCEAgenti/createIzdanie.xhtml";
    }

    public void showPageAgent() {
        showActionGeneral();
        showActionForAgenti = "/ribbonElements/actionAgenti/actionApplyDestroyAgenti.xhtml";
        showingPage = "/listSCEAgenti/showAgenti.xhtml";
    }

    public void showPageDogovor() {
        showActionGeneral();
        showActionForAgenti = "/ribbonElements/actionAgenti/actionApplyDestroyDogovor.xhtml";
        showingPage = "/listSCEAgenti/showDogovors.xhtml";
    }

    public void showPageIzdanie1() {
        showActionGeneral();
        showActionForAgenti = "/ribbonElements/actionAgenti/actionApplyDestroyIzdanie.xhtml";
        showingPage = "/listSCEAgenti/showIzdanie.xhtml";
    }

    //общие методы для класса
    private void showActionGeneral() {
        showActionForAgenti = "";
        ribbonIndex = 1;
    }

    public void undoAction() {
        showActionGeneral();
        showingPage = bufferForShowDialogPage;
    }

    //----------------------------------------------------------------------------------------------------------------
    //КОНСТРУКТОРЫ
    public List<IdKontragentov> getSpisokAgentov() {
        return spisokAgentov;
    }

    public void setSpisokAgentov(List<IdKontragentov> spisokAgentov) {
        this.spisokAgentov = spisokAgentov;
    }

    public List<Dogovora> getSpisokDogovorov() {
        return spisokDogovorov;
    }

    public void setSpisokDogovorov(List<Dogovora> spisokDogovorov) {
        this.spisokDogovorov = spisokDogovorov;

    }

    public List<ReestrIzdanii> getSpisokIzdanii() {
        return spisokIzdanii;
    }

    public void setSpisokIzdanii(List<ReestrIzdanii> spisokIzdanii) {
        this.spisokIzdanii = spisokIzdanii;
    }

    public IdKontragentov getBuferAgent() {
        return buferAgent;
    }

    public void setBuferAgent(IdKontragentov buferAgent) {
        this.buferAgent = buferAgent;
    }

    public Dogovora getDogovora() {
        return dogovora;
    }

    public void setDogovora(Dogovora dogovora) {
        this.dogovora = dogovora;
    }

    public ReestrIzdanii getIzdanii() {
        return izdanii;
    }

    public void setIzdanii(ReestrIzdanii izdanii) {
        this.izdanii = izdanii;
    }

    public boolean isShowActionForIdKontrAgenta() {
        return showActionForIdKontrAgenta;
    }

    public void setShowActionForIdKontrAgenta(boolean showActionForIdKontrAgenta) {
        this.showActionForIdKontrAgenta = showActionForIdKontrAgenta;
    }

    public int getRibbonIndex() {
        return ribbonIndex;
    }

    public void setRibbonIndex(int ribbonIndex) {
        this.ribbonIndex = ribbonIndex;
    }

    public boolean isShowActionForDogovor() {
        return showActionForDogovor;
    }

    public void setShowActionForDogovor(boolean showActionForDogovor) {
        this.showActionForDogovor = showActionForDogovor;
    }

    public boolean isShowActionForIzdanie() {
        return showActionForIzdanie;
    }

    public void setShowActionForIzdanie(boolean showActionForIzdanie) {
        this.showActionForIzdanie = showActionForIzdanie;
    }

    public String getShowingPage() {
        return showingPage;
    }

    public void setShowingPage(String showingPage) {
        this.showingPage = showingPage;
    }

    public String getShowDialogPage() {
        return showDialogPage;
    }

    public void setShowDialogPage(String showDialogPage) {
        this.showDialogPage = showDialogPage;
    }

    public String getShowActionForAgenti() {
        return showActionForAgenti;
    }

    public void setShowActionForAgenti(String showActionForAgenti) {
        this.showActionForAgenti = showActionForAgenti;
    }

    public String getPreviewPanel() {
        return previewPanel;
    }

    public void setPreviewPanel(String previewPanel) {
        this.previewPanel = previewPanel;
    }
}
