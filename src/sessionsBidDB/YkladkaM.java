package sessionsBidDB;

import model.Ykladkanapaleti;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class YkladkaM extends AbstractFacadeBidDB<Ykladkanapaleti> {
    public YkladkaM() {
        super(Ykladkanapaleti.class, "SELECT o FROM Ykladkanapaleti AS o");
    }
}
