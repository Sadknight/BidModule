package model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by DMalenkov on 26.11.2014.
 */
@Entity
@javax.persistence.Table(name = "id_kontragentov", schema = "", catalog = "bid")
public class IdKontragentov implements Serializable {
    private long idagenta;
    private String clientName;
    private String number1C;
    private String zakazchik;
    private String podryad;
    private String postavschik;
    private String arendator;
    private Long inn;
    private String urAdres;
    private String factAdres;
    private String director;
    private Date dateRojdeniya;
    private String telefon;
    private String fax;
    private String www;
    private String eMail;
    private String tipAgenta;
    private String oblast;
    private String napravlenieDeyatelnosti;
    private String reiting;
    private String commentAgent;

    @Id
    @javax.persistence.Column(name = "idagenta", nullable = false, insertable = true, updatable = true)
    public long getIdagenta() {
        return idagenta;
    }

    public void setIdagenta(long idagenta) {
        this.idagenta = idagenta;
    }

    @Basic
    @javax.persistence.Column(name = "client_name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Basic
    @javax.persistence.Column(name = "number_1c", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNumber1C() {
        return number1C;
    }

    public void setNumber1C(String number1C) {
        this.number1C = number1C;
    }

    @Basic
    @javax.persistence.Column(name = "zakazchik", nullable = true, insertable = true, updatable = true, length = 10)
    public String getZakazchik() {
        return zakazchik;
    }

    public void setZakazchik(String zakazchik) {
        this.zakazchik = zakazchik;
    }

    @Basic
    @javax.persistence.Column(name = "podryad", nullable = true, insertable = true, updatable = true, length = 10)
    public String getPodryad() {
        return podryad;
    }

    public void setPodryad(String podryad) {
        this.podryad = podryad;
    }

    @Basic
    @javax.persistence.Column(name = "postavschik", nullable = true, insertable = true, updatable = true, length = 10)
    public String getPostavschik() {
        return postavschik;
    }

    public void setPostavschik(String postavschik) {
        this.postavschik = postavschik;
    }

    @Basic
    @javax.persistence.Column(name = "arendator", nullable = true, insertable = true, updatable = true, length = 10)
    public String getArendator() {
        return arendator;
    }

    public void setArendator(String arendator) {
        this.arendator = arendator;
    }

    @Basic
    @javax.persistence.Column(name = "INN", nullable = true, insertable = true, updatable = true)
    public Long getInn() {
        return inn;
    }

    public void setInn(Long inn) {
        this.inn = inn;
    }

    @Basic
    @javax.persistence.Column(name = "Ur_adres", nullable = true, insertable = true, updatable = true, length = 500)
    public String getUrAdres() {
        return urAdres;
    }

    public void setUrAdres(String urAdres) {
        this.urAdres = urAdres;
    }

    @Basic
    @javax.persistence.Column(name = "Fact_adres", nullable = true, insertable = true, updatable = true, length = 500)
    public String getFactAdres() {
        return factAdres;
    }

    public void setFactAdres(String factAdres) {
        this.factAdres = factAdres;
    }

    @Basic
    @javax.persistence.Column(name = "Director", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Basic
    @javax.persistence.Column(name = "date_rojdeniya", nullable = true, insertable = true, updatable = true)
    public Date getDateRojdeniya() {
        return dateRojdeniya;
    }

    public void setDateRojdeniya(Date dateRojdeniya) {
        this.dateRojdeniya = dateRojdeniya;
    }

    @Basic
    @javax.persistence.Column(name = "telefon", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Basic
    @javax.persistence.Column(name = "fax", nullable = true, insertable = true, updatable = true, length = 255)
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @javax.persistence.Column(name = "www", nullable = true, insertable = true, updatable = true, length = 255)
    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }

    @Basic
    @javax.persistence.Column(name = "e_mail", nullable = true, insertable = true, updatable = true, length = 255)
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Basic
    @javax.persistence.Column(name = "tip_agenta", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTipAgenta() {
        return tipAgenta;
    }

    public void setTipAgenta(String tipAgenta) {
        this.tipAgenta = tipAgenta;
    }

    @Basic
    @javax.persistence.Column(name = "oblast", nullable = true, insertable = true, updatable = true, length = 255)
    public String getOblast() {
        return oblast;
    }

    public void setOblast(String oblast) {
        this.oblast = oblast;
    }

    @Basic
    @javax.persistence.Column(name = "napravlenie_deyatelnosti", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNapravlenieDeyatelnosti() {
        return napravlenieDeyatelnosti;
    }

    public void setNapravlenieDeyatelnosti(String napravlenieDeyatelnosti) {
        this.napravlenieDeyatelnosti = napravlenieDeyatelnosti;
    }

    @Basic
    @javax.persistence.Column(name = "reiting", nullable = true, insertable = true, updatable = true, length = 255)
    public String getReiting() {
        return reiting;
    }

    public void setReiting(String reiting) {
        this.reiting = reiting;
    }

    @Basic
    @javax.persistence.Column(name = "comment_agent", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCommentAgent() {
        return commentAgent;
    }

    public void setCommentAgent(String commentAgent) {
        this.commentAgent = commentAgent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdKontragentov that = (IdKontragentov) o;

        if (idagenta != that.idagenta) return false;
        if (arendator != null ? !arendator.equals(that.arendator) : that.arendator != null) return false;
        if (clientName != null ? !clientName.equals(that.clientName) : that.clientName != null) return false;
        if (commentAgent != null ? !commentAgent.equals(that.commentAgent) : that.commentAgent != null) return false;
        if (dateRojdeniya != null ? !dateRojdeniya.equals(that.dateRojdeniya) : that.dateRojdeniya != null)
            return false;
        if (director != null ? !director.equals(that.director) : that.director != null) return false;
        if (eMail != null ? !eMail.equals(that.eMail) : that.eMail != null) return false;
        if (factAdres != null ? !factAdres.equals(that.factAdres) : that.factAdres != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (inn != null ? !inn.equals(that.inn) : that.inn != null) return false;
        if (napravlenieDeyatelnosti != null ? !napravlenieDeyatelnosti.equals(that.napravlenieDeyatelnosti) : that.napravlenieDeyatelnosti != null)
            return false;
        if (number1C != null ? !number1C.equals(that.number1C) : that.number1C != null) return false;
        if (oblast != null ? !oblast.equals(that.oblast) : that.oblast != null) return false;
        if (podryad != null ? !podryad.equals(that.podryad) : that.podryad != null) return false;
        if (postavschik != null ? !postavschik.equals(that.postavschik) : that.postavschik != null) return false;
        if (reiting != null ? !reiting.equals(that.reiting) : that.reiting != null) return false;
        if (telefon != null ? !telefon.equals(that.telefon) : that.telefon != null) return false;
        if (tipAgenta != null ? !tipAgenta.equals(that.tipAgenta) : that.tipAgenta != null) return false;
        if (urAdres != null ? !urAdres.equals(that.urAdres) : that.urAdres != null) return false;
        if (www != null ? !www.equals(that.www) : that.www != null) return false;
        if (zakazchik != null ? !zakazchik.equals(that.zakazchik) : that.zakazchik != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idagenta ^ (idagenta >>> 32));
        result = 31 * result + (clientName != null ? clientName.hashCode() : 0);
        result = 31 * result + (number1C != null ? number1C.hashCode() : 0);
        result = 31 * result + (zakazchik != null ? zakazchik.hashCode() : 0);
        result = 31 * result + (podryad != null ? podryad.hashCode() : 0);
        result = 31 * result + (postavschik != null ? postavschik.hashCode() : 0);
        result = 31 * result + (arendator != null ? arendator.hashCode() : 0);
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (urAdres != null ? urAdres.hashCode() : 0);
        result = 31 * result + (factAdres != null ? factAdres.hashCode() : 0);
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (dateRojdeniya != null ? dateRojdeniya.hashCode() : 0);
        result = 31 * result + (telefon != null ? telefon.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (www != null ? www.hashCode() : 0);
        result = 31 * result + (eMail != null ? eMail.hashCode() : 0);
        result = 31 * result + (tipAgenta != null ? tipAgenta.hashCode() : 0);
        result = 31 * result + (oblast != null ? oblast.hashCode() : 0);
        result = 31 * result + (napravlenieDeyatelnosti != null ? napravlenieDeyatelnosti.hashCode() : 0);
        result = 31 * result + (reiting != null ? reiting.hashCode() : 0);
        result = 31 * result + (commentAgent != null ? commentAgent.hashCode() : 0);
        return result;
    }
}
