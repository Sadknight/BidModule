package sessionsBidDB;

import model.Podizdaniya;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class PodizdanieM extends AbstractFacadeBidDB<Podizdaniya> {
    public PodizdanieM() {
        super(Podizdaniya.class, "SELECT o FROM Podizdaniya AS o");
    }
}
