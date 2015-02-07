package sessionsBidDB;

import model.Idzayavki;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class IdZayavkiM extends AbstractFacadeBidDB<Idzayavki> {
    public IdZayavkiM() {
        super(Idzayavki.class, "SELECT o FROM Idzayavki AS o");
    }
}
