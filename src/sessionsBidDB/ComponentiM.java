package sessionsBidDB;

import model.Componenti;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class ComponentiM extends AbstractFacadeBidDB<Componenti> {
    public ComponentiM() {
        super(Componenti.class, "SELECT o FROM Componenti AS o");
    }
}
