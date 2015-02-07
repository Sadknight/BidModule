package sessionsBidDB;

import model.Dogovora;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class DogovoraM extends AbstractFacadeBidDB<Dogovora> {
    public DogovoraM() {
        super(Dogovora.class, "SELECT o FROM Dogovora AS o");
    }
}
