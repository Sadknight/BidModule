package sessionsBidDB;

import model.ReestrIzdanii;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class ReestrIzdaniiM extends AbstractFacadeBidDB<ReestrIzdanii> {
    public ReestrIzdaniiM() {
        super(ReestrIzdanii.class, "SELECT o FROM ReestrIzdanii AS o");
    }
}
