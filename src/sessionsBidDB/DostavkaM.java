package sessionsBidDB;

import model.Dostavka;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class DostavkaM extends AbstractFacadeBidDB<Dostavka> {
    public DostavkaM() {
        super(Dostavka.class, "SELECT o FROM Dostavka AS o");
    }
}
