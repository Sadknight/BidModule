package managerCreateBid;

import java.io.Serializable;

public class ManagerMainZayavki implements Serializable {
    private static final long serialVersionUID = 1L;

    boolean showIDZayavki = true;
    boolean showComponenti = false;
    boolean showPodizdaniya = false;


    public void chShowIDZayavki() {
        this.showIDZayavki = true;
        this.showComponenti = false;
        this.showPodizdaniya = false;
        System.out.println("chShowIDZayavki()");

    }

    public void chShowComponenti() {
        this.showIDZayavki = false;
        this.showComponenti = true;
        this.showPodizdaniya = false;
        System.out.println("chshowComponenti()");

    }

    public void chShowPodizdaniya() {
        this.showIDZayavki = false;
        this.showComponenti = false;
        this.showPodizdaniya = true;
        System.out.println("chshowPodizdaniya()");
    }

    // ������������
    public boolean isShowIDZayavki() {
        return showIDZayavki;
    }

    public void setShowIDZayavki(boolean showIDZayavki) {
        this.showIDZayavki = showIDZayavki;
    }

    public boolean isShowComponenti() {
        return showComponenti;
    }

    public void setShowComponenti(boolean showComponenti) {
        this.showComponenti = showComponenti;
    }

    public boolean isShowPodizdaniya() {
        return showPodizdaniya;
    }

    public void setShowPodizdaniya(boolean showPodizdaniya) {
        this.showPodizdaniya = showPodizdaniya;
    }

}
