package sessionsBidDB;

import model.Contacts;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class ContactsM extends AbstractFacadeBidDB<Contacts> {
    public ContactsM() {
        super(Contacts.class, "SELECT o FROM Contacts AS o");
    }
}
