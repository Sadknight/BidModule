package sessionsBidDB;

import model.Pantonespravochnik;

/**
 * Created by DMalenkov on 17.11.2014.
 */
public class SparovochnikPantone extends AbstractFacadeBidDB<Pantonespravochnik> {
    public SparovochnikPantone() {
        super(Pantonespravochnik.class, "SELECT o FROM Pantonespravochnik AS o");
    }
}
