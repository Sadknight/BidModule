package sessionsBidDB;

import model.Operaciisgotovimizdeliem;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class OperaciiM extends AbstractFacadeBidDB<Operaciisgotovimizdeliem> {
    public OperaciiM() {
        super(Operaciisgotovimizdeliem.class, "SELECT o FROM Operaciisgotovimizdeliem AS o");
    }
}
