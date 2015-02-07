package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by DMalenkov on 26.11.2014.
 */
@Entity
public class Contacts implements Serializable {
    private long idcontacts;
    private Long numberIzd;
    private Long dogovor;
    private Long kontragent;
    private String fio;
    private String telefon;
    private String mail;
    private Date bd;
    private String commentContacts;

    @Id
    @Column(name = "idcontacts", nullable = false, insertable = true, updatable = true)
    public long getIdcontacts() {
        return idcontacts;
    }

    public void setIdcontacts(long idcontacts) {
        this.idcontacts = idcontacts;
    }

    @Basic
    @Column(name = "number_izd", nullable = true, insertable = true, updatable = true)
    public Long getNumberIzd() {
        return numberIzd;
    }

    public void setNumberIzd(Long numberIzd) {
        this.numberIzd = numberIzd;
    }

    @Basic
    @Column(name = "dogovor", nullable = true, insertable = true, updatable = true)
    public Long getDogovor() {
        return dogovor;
    }

    public void setDogovor(Long dogovor) {
        this.dogovor = dogovor;
    }

    @Basic
    @Column(name = "kontragent", nullable = true, insertable = true, updatable = true)
    public Long getKontragent() {
        return kontragent;
    }

    public void setKontragent(Long kontragent) {
        this.kontragent = kontragent;
    }

    @Basic
    @Column(name = "FIO", nullable = true, insertable = true, updatable = true, length = 255)
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Basic
    @Column(name = "telefon", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Basic
    @Column(name = "mail", nullable = true, insertable = true, updatable = true, length = 255)
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "bd", nullable = true, insertable = true, updatable = true)
    public Date getBd() {
        return bd;
    }

    public void setBd(Date bd) {
        this.bd = bd;
    }

    @Basic
    @Column(name = "comment_contacts", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCommentContacts() {
        return commentContacts;
    }

    public void setCommentContacts(String commentContacts) {
        this.commentContacts = commentContacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contacts contacts = (Contacts) o;

        if (idcontacts != contacts.idcontacts) return false;
        if (bd != null ? !bd.equals(contacts.bd) : contacts.bd != null) return false;
        if (commentContacts != null ? !commentContacts.equals(contacts.commentContacts) : contacts.commentContacts != null)
            return false;
        if (dogovor != null ? !dogovor.equals(contacts.dogovor) : contacts.dogovor != null) return false;
        if (fio != null ? !fio.equals(contacts.fio) : contacts.fio != null) return false;
        if (kontragent != null ? !kontragent.equals(contacts.kontragent) : contacts.kontragent != null) return false;
        if (mail != null ? !mail.equals(contacts.mail) : contacts.mail != null) return false;
        if (numberIzd != null ? !numberIzd.equals(contacts.numberIzd) : contacts.numberIzd != null) return false;
        if (telefon != null ? !telefon.equals(contacts.telefon) : contacts.telefon != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idcontacts ^ (idcontacts >>> 32));
        result = 31 * result + (numberIzd != null ? numberIzd.hashCode() : 0);
        result = 31 * result + (dogovor != null ? dogovor.hashCode() : 0);
        result = 31 * result + (kontragent != null ? kontragent.hashCode() : 0);
        result = 31 * result + (fio != null ? fio.hashCode() : 0);
        result = 31 * result + (telefon != null ? telefon.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (bd != null ? bd.hashCode() : 0);
        result = 31 * result + (commentContacts != null ? commentContacts.hashCode() : 0);
        return result;
    }
}
