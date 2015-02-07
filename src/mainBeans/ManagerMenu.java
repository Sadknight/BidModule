package mainBeans;

import model.Dogovora;
import model.Idzayavki;
import org.primefaces.event.SelectEvent;

import javax.annotation.PostConstruct;
import java.util.Date;

public class ManagerMenu {
    private Idzayavki idZayavki;
    private Dogovora dogovora;

    @PostConstruct
    public void createNewBean() {
        idZayavki = new Idzayavki();
        idZayavki.setColComponent(1);
        idZayavki.setColPodizdanii(1);
        idZayavki.setFormat1(210);
        idZayavki.setFormat2(297);
        idZayavki.setCommentIzdanie("Основное издание ");
        idZayavki.setTiraj(1000);
        idZayavki.setDateBegin(new Date());
        idZayavki.setDateEnd(new Date());
        idZayavki.setColDopIzdelii(0);
        idZayavki.setTipIzdeliya("---");
    }

    public Idzayavki getIdZayavki() {
        return idZayavki;
    }

    public void setIdZayavki(Idzayavki idZayavki) {
        this.idZayavki = idZayavki;
    }

    public void saveDate(SelectEvent event) {
    }

    public void saveMethod() {
    }

    public Dogovora getDogovora() {
        return dogovora;
    }

    public void setDogovora(Dogovora dogovora) {
        this.dogovora = dogovora;
    }
}
