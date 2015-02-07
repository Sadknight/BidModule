package sessionsBidDB;

import model.Spyski;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class SpyskiM extends AbstractFacadeBidDB<Spyski> {
    public SpyskiM() {
        super(Spyski.class, "SELECT o FROM Spyski AS o");
    }
}
