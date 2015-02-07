package sessionsBidDB;

import model.Otdelkacomponenti;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class OtdelkaM extends AbstractFacadeBidDB<Otdelkacomponenti> {
    public OtdelkaM() {
        super(Otdelkacomponenti.class, "SELECT o FROM Otdelkacomponenti AS o");
    }
}
