package sessionsBidDB;

import model.IdKontragentov;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class IdKontragentovM extends AbstractFacadeBidDB<IdKontragentov> {
    public IdKontragentovM() {
        super(IdKontragentov.class, "SELECT o FROM IdKontragentov AS o");
    }
}
