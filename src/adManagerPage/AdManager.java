package adManagerPage;

import model.Ad;
import model.Hiflexusers;
import org.primefaces.event.SelectEvent;
import sessionsBidDB.AdM;
import sessionsBidDB.ConnectionBidDB;
import sessionsBidDB.HiflexUsersM;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by DMalenkov on 20.02.2015.
 */
public class AdManager {
    private List<Hiflexusers> hxAll;
    private List<Ad> adAll;
    private Ad buferAd;
    private ConnectionBidDB connectionBidDB;
    private String showAdAction;

    @PostConstruct
    public void newClass() {
        connectionBidDB = new AdM();
        adAll = connectionBidDB.getEntities();
        connectionBidDB = new HiflexUsersM();
        hxAll = connectionBidDB.getEntities();
    }

    public void showAdAction(SelectEvent event) {
        String st;
        buferAd = (Ad) event.getObject();
        showAdAction = "/ribbonElements/actionAd/actionAD.xhtml";
    }

    public void hideAdAction(SelectEvent event) {
        buferAd = new Ad();
        showAdAction = "";
    }

    //Конструкторы
    public List<Ad> getAdAll() {
        return adAll;
    }

    public void setAdAll(List<Ad> adAll) {
        this.adAll = adAll;
    }

    public Ad getBuferAd() {
        return buferAd;
    }

    public void setBuferAd(Ad buferAd) {
        this.buferAd = buferAd;
    }

    public String getShowAdAction() {
        return showAdAction;
    }

    public void setShowAdAction(String showAdAction) {
        this.showAdAction = showAdAction;
    }

    public List<Hiflexusers> getHxAll() {
        return hxAll;
    }

    public void setHxAll(List<Hiflexusers> hxAll) {
        this.hxAll = hxAll;
    }
}
