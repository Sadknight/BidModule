package sessionsBidDB;

import model.Broshyrovkapodizdaniya;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class BroshyrovkaM extends AbstractFacadeBidDB<Broshyrovkapodizdaniya> {
    public BroshyrovkaM() {
        super(Broshyrovkapodizdaniya.class, "SELECT o FROM Broshyrovkapodizdaniya AS o");
    }
}
