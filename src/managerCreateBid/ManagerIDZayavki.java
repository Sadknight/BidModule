package managerCreateBid;

import interfaces.ConnectionBidDB;
import model.ReestrIzdanii;
import sessionsBidDB.ReestrIzdaniiM;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ManagerIDZayavki implements Serializable {
    //Параметры класса
    private List<ReestrIzdanii> idzayavkiList = new ArrayList<>();
    private List<ReestrIzdanii> spisokIzdanii = new ArrayList<>();

    @PostConstruct
    public void newClass() {
        List<ReestrIzdanii> bufSpisok;
        ConnectionBidDB<ReestrIzdanii> connectionBidDB = new ReestrIzdaniiM();
        bufSpisok = connectionBidDB.getEntities();

        spisokIzdanii = bufSpisok;
        idzayavkiList = spisokIzdanii;
    }

    //Методы класса
    public void chSpisok(ReestrIzdanii reestrIzdanii) {
        System.out.println("Выбор в списке");
        System.out.println(reestrIzdanii.getNameIzd() + " " + reestrIzdanii.getClientname());
    }

    //Конструкторы
    public List<ReestrIzdanii> getSpisokIzdanii() {
        return spisokIzdanii;
    }

    public void setSpisokIzdanii(List<ReestrIzdanii> spisokIzdanii) {
        this.spisokIzdanii = spisokIzdanii;
    }

    public List<ReestrIzdanii> getIdzayavkiList() {
        return idzayavkiList;
    }

    public void setIdzayavkiList(List<ReestrIzdanii> idzayavkiList) {
        this.idzayavkiList = idzayavkiList;
    }
}
