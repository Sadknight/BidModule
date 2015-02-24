package mainBeans;

/**
 * Created by DMalenkov on 24.02.2015.
 */
public class MainBean {
    private String nameBean;

    MainBean() {
        nameBean = "default";
    }

    MainBean(String nameBean) {
        this.nameBean = nameBean;
    }

    public String getNameBean() {
        return nameBean;
    }

    public void setNameBean(String nameBean) {
        this.nameBean = nameBean;
    }
}
