package sessionsBidDB;

import model.Dostavkasignalov;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class DostavkaSignalovM extends AbstractFacadeBidDB<Dostavkasignalov> {
    public DostavkaSignalovM() {
        super(Dostavkasignalov.class, "SELECT o FROM Dostavkasignalov AS o");
    }
}
