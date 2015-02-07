package sessionsBidDB;

import model.Pantoninamashine;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class PantoniM extends AbstractFacadeBidDB<Pantoninamashine> {
    public PantoniM() {
        super(Pantoninamashine.class, "SELECT o FROM Pantoninamashine AS o");
    }
}
