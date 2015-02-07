package sessionsBidDB;

import model.Ypakovkagotovogoizdeliya;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class YpakovkaM extends AbstractFacadeBidDB<Ypakovkagotovogoizdeliya> {
    public YpakovkaM() {
        super(Ypakovkagotovogoizdeliya.class, "SELECT o FROM Ypakovkagotovogoizdeliya AS o");
    }
}
