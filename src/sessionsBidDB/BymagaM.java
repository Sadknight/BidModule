package sessionsBidDB;

import model.Bymaga;


/**
 * Created by DMalenkov on 01.10.2014.
 */
public class BymagaM extends AbstractFacadeBidDB<Bymaga> {
    public BymagaM() {
        super(Bymaga.class, "SELECT o FROM Bymaga AS o");
    }
}
