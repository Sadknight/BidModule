package sessionsBidDB;

import model.Lakirovanienamashine;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class LakirovanieM extends AbstractFacadeBidDB<Lakirovanienamashine> {
    public LakirovanieM() {
        super(Lakirovanienamashine.class, "SELECT o FROM Lakirovanienamashine AS o");
    }
}
