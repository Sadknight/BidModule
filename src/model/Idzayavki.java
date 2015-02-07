package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by DMalenkov on 26.11.2014.
 */
@Entity
public class Idzayavki implements Serializable {
    private long idZayavok;
    private Long idKontragenta;
    private Long idDogovora;
    private Long idIzdanie;
    private String commentIzdanie;
    private String nazvanieZakazchika;
    private String nazvanieIzdaniya;
    private Integer colComponent;
    private Integer colPodizdanii;
    private Integer numZayavki;
    private Integer numCalkylyacii;
    private Integer numZakaza;
    private String managerCreat;
    private Date dateBegin;
    private Date dateEnd;
    private String tipIzdeliya;
    private Integer format1;
    private Integer format2;
    private Integer tiraj;
    private Byte operaciiSIzdeliem;
    private Byte signali;
    private Byte maketIzdaniya;
    private Integer colDopIzdelii;

    @Id
    @javax.persistence.Column(name = "idZayavok", nullable = false, insertable = true, updatable = true)
    public long getIdZayavok() {
        return idZayavok;
    }

    public void setIdZayavok(long idZayavok) {
        this.idZayavok = idZayavok;
    }

    @Basic
    @javax.persistence.Column(name = "idKontragenta", nullable = true, insertable = true, updatable = true)
    public Long getIdKontragenta() {
        return idKontragenta;
    }

    public void setIdKontragenta(Long idKontragenta) {
        this.idKontragenta = idKontragenta;
    }

    @Basic
    @javax.persistence.Column(name = "idDogovora", nullable = true, insertable = true, updatable = true)
    public Long getIdDogovora() {
        return idDogovora;
    }

    public void setIdDogovora(Long idDogovora) {
        this.idDogovora = idDogovora;
    }

    @Basic
    @javax.persistence.Column(name = "idIzdanie", nullable = true, insertable = true, updatable = true)
    public Long getIdIzdanie() {
        return idIzdanie;
    }

    public void setIdIzdanie(Long idIzdanie) {
        this.idIzdanie = idIzdanie;
    }

    @Basic
    @javax.persistence.Column(name = "commentIzdanie", nullable = true, insertable = true, updatable = true, length = 45)
    public String getCommentIzdanie() {
        return commentIzdanie;
    }

    public void setCommentIzdanie(String commentIzdanie) {
        this.commentIzdanie = commentIzdanie;
    }

    @Basic
    @javax.persistence.Column(name = "nazvanieZakazchika", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNazvanieZakazchika() {
        return nazvanieZakazchika;
    }

    public void setNazvanieZakazchika(String nazvanieZakazchika) {
        this.nazvanieZakazchika = nazvanieZakazchika;
    }

    @Basic
    @javax.persistence.Column(name = "nazvanieIzdaniya", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNazvanieIzdaniya() {
        return nazvanieIzdaniya;
    }

    public void setNazvanieIzdaniya(String nazvanieIzdaniya) {
        this.nazvanieIzdaniya = nazvanieIzdaniya;
    }

    @Basic
    @javax.persistence.Column(name = "colComponent", nullable = true, insertable = true, updatable = true)
    public Integer getColComponent() {
        return colComponent;
    }

    public void setColComponent(Integer colComponent) {
        this.colComponent = colComponent;
    }

    @Basic
    @javax.persistence.Column(name = "colPodizdanii", nullable = true, insertable = true, updatable = true)
    public Integer getColPodizdanii() {
        return colPodizdanii;
    }

    public void setColPodizdanii(Integer colPodizdanii) {
        this.colPodizdanii = colPodizdanii;
    }

    @Basic
    @javax.persistence.Column(name = "numZayavki", nullable = true, insertable = true, updatable = true)
    public Integer getNumZayavki() {
        return numZayavki;
    }

    public void setNumZayavki(Integer numZayavki) {
        this.numZayavki = numZayavki;
    }

    @Basic
    @javax.persistence.Column(name = "numCalkylyacii", nullable = true, insertable = true, updatable = true)
    public Integer getNumCalkylyacii() {
        return numCalkylyacii;
    }

    public void setNumCalkylyacii(Integer numCalkylyacii) {
        this.numCalkylyacii = numCalkylyacii;
    }

    @Basic
    @javax.persistence.Column(name = "numZakaza", nullable = true, insertable = true, updatable = true)
    public Integer getNumZakaza() {
        return numZakaza;
    }

    public void setNumZakaza(Integer numZakaza) {
        this.numZakaza = numZakaza;
    }

    @Basic
    @javax.persistence.Column(name = "ManagerCreat", nullable = true, insertable = true, updatable = true, length = 255)
    public String getManagerCreat() {
        return managerCreat;
    }

    public void setManagerCreat(String managerCreat) {
        this.managerCreat = managerCreat;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @javax.persistence.Column(name = "dateBegin", nullable = true, insertable = true, updatable = true)
    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @javax.persistence.Column(name = "dateEnd", nullable = true, insertable = true, updatable = true)
    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Basic
    @javax.persistence.Column(name = "tipIzdeliya", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTipIzdeliya() {
        return tipIzdeliya;
    }

    public void setTipIzdeliya(String tipIzdeliya) {
        this.tipIzdeliya = tipIzdeliya;
    }

    @Basic
    @javax.persistence.Column(name = "format1", nullable = true, insertable = true, updatable = true)
    public Integer getFormat1() {
        return format1;
    }

    public void setFormat1(Integer format1) {
        this.format1 = format1;
    }

    @Basic
    @javax.persistence.Column(name = "format2", nullable = true, insertable = true, updatable = true)
    public Integer getFormat2() {
        return format2;
    }

    public void setFormat2(Integer format2) {
        this.format2 = format2;
    }

    @Basic
    @javax.persistence.Column(name = "tiraj", nullable = true, insertable = true, updatable = true)
    public Integer getTiraj() {
        return tiraj;
    }

    public void setTiraj(Integer tiraj) {
        this.tiraj = tiraj;
    }

    @Basic
    @javax.persistence.Column(name = "operaciiSIzdeliem", nullable = true, insertable = true, updatable = true)
    public Byte getOperaciiSIzdeliem() {
        return operaciiSIzdeliem;
    }

    public void setOperaciiSIzdeliem(Byte operaciiSIzdeliem) {
        this.operaciiSIzdeliem = operaciiSIzdeliem;
    }

    @Basic
    @javax.persistence.Column(name = "signali", nullable = true, insertable = true, updatable = true)
    public Byte getSignali() {
        return signali;
    }

    public void setSignali(Byte signali) {
        this.signali = signali;
    }

    @Basic
    @javax.persistence.Column(name = "maketIzdaniya", nullable = true, insertable = true, updatable = true)
    public Byte getMaketIzdaniya() {
        return maketIzdaniya;
    }

    public void setMaketIzdaniya(Byte maketIzdaniya) {
        this.maketIzdaniya = maketIzdaniya;
    }

    @Basic
    @javax.persistence.Column(name = "colDopIzdelii", nullable = true, insertable = true, updatable = true)
    public Integer getColDopIzdelii() {
        return colDopIzdelii;
    }

    public void setColDopIzdelii(Integer colDopIzdelii) {
        this.colDopIzdelii = colDopIzdelii;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Idzayavki idzayavki = (Idzayavki) o;

        if (idZayavok != idzayavki.idZayavok) return false;
        if (colComponent != null ? !colComponent.equals(idzayavki.colComponent) : idzayavki.colComponent != null)
            return false;
        if (colDopIzdelii != null ? !colDopIzdelii.equals(idzayavki.colDopIzdelii) : idzayavki.colDopIzdelii != null)
            return false;
        if (colPodizdanii != null ? !colPodizdanii.equals(idzayavki.colPodizdanii) : idzayavki.colPodizdanii != null)
            return false;
        if (commentIzdanie != null ? !commentIzdanie.equals(idzayavki.commentIzdanie) : idzayavki.commentIzdanie != null)
            return false;
        if (dateBegin != null ? !dateBegin.equals(idzayavki.dateBegin) : idzayavki.dateBegin != null) return false;
        if (dateEnd != null ? !dateEnd.equals(idzayavki.dateEnd) : idzayavki.dateEnd != null) return false;
        if (format1 != null ? !format1.equals(idzayavki.format1) : idzayavki.format1 != null) return false;
        if (format2 != null ? !format2.equals(idzayavki.format2) : idzayavki.format2 != null) return false;
        if (idDogovora != null ? !idDogovora.equals(idzayavki.idDogovora) : idzayavki.idDogovora != null) return false;
        if (idIzdanie != null ? !idIzdanie.equals(idzayavki.idIzdanie) : idzayavki.idIzdanie != null) return false;
        if (idKontragenta != null ? !idKontragenta.equals(idzayavki.idKontragenta) : idzayavki.idKontragenta != null)
            return false;
        if (maketIzdaniya != null ? !maketIzdaniya.equals(idzayavki.maketIzdaniya) : idzayavki.maketIzdaniya != null)
            return false;
        if (managerCreat != null ? !managerCreat.equals(idzayavki.managerCreat) : idzayavki.managerCreat != null)
            return false;
        if (numCalkylyacii != null ? !numCalkylyacii.equals(idzayavki.numCalkylyacii) : idzayavki.numCalkylyacii != null)
            return false;
        if (numZakaza != null ? !numZakaza.equals(idzayavki.numZakaza) : idzayavki.numZakaza != null) return false;
        if (numZayavki != null ? !numZayavki.equals(idzayavki.numZayavki) : idzayavki.numZayavki != null) return false;
        if (operaciiSIzdeliem != null ? !operaciiSIzdeliem.equals(idzayavki.operaciiSIzdeliem) : idzayavki.operaciiSIzdeliem != null)
            return false;
        if (signali != null ? !signali.equals(idzayavki.signali) : idzayavki.signali != null) return false;
        if (tipIzdeliya != null ? !tipIzdeliya.equals(idzayavki.tipIzdeliya) : idzayavki.tipIzdeliya != null)
            return false;
        if (tiraj != null ? !tiraj.equals(idzayavki.tiraj) : idzayavki.tiraj != null) return false;
        if (nazvanieZakazchika != null ? !nazvanieZakazchika.equals(idzayavki.nazvanieZakazchika) : idzayavki.nazvanieZakazchika != null)
            return false;
        if (nazvanieIzdaniya != null ? !nazvanieIzdaniya.equals(idzayavki.nazvanieIzdaniya) : idzayavki.nazvanieIzdaniya != null)
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        int result = (int) (idZayavok ^ (idZayavok >>> 32));
        result = 31 * result + (idKontragenta != null ? idKontragenta.hashCode() : 0);
        result = 31 * result + (idDogovora != null ? idDogovora.hashCode() : 0);
        result = 31 * result + (idIzdanie != null ? idIzdanie.hashCode() : 0);
        result = 31 * result + (nazvanieZakazchika != null ? nazvanieZakazchika.hashCode() : 0);
        result = 31 * result + (nazvanieIzdaniya != null ? nazvanieIzdaniya.hashCode() : 0);
        result = 31 * result + (commentIzdanie != null ? commentIzdanie.hashCode() : 0);
        result = 31 * result + (colComponent != null ? colComponent.hashCode() : 0);
        result = 31 * result + (colPodizdanii != null ? colPodizdanii.hashCode() : 0);
        result = 31 * result + (numZayavki != null ? numZayavki.hashCode() : 0);
        result = 31 * result + (numCalkylyacii != null ? numCalkylyacii.hashCode() : 0);
        result = 31 * result + (numZakaza != null ? numZakaza.hashCode() : 0);
        result = 31 * result + (managerCreat != null ? managerCreat.hashCode() : 0);
        result = 31 * result + (dateBegin != null ? dateBegin.hashCode() : 0);
        result = 31 * result + (dateEnd != null ? dateEnd.hashCode() : 0);
        result = 31 * result + (tipIzdeliya != null ? tipIzdeliya.hashCode() : 0);
        result = 31 * result + (format1 != null ? format1.hashCode() : 0);
        result = 31 * result + (format2 != null ? format2.hashCode() : 0);
        result = 31 * result + (tiraj != null ? tiraj.hashCode() : 0);
        result = 31 * result + (operaciiSIzdeliem != null ? operaciiSIzdeliem.hashCode() : 0);
        result = 31 * result + (signali != null ? signali.hashCode() : 0);
        result = 31 * result + (maketIzdaniya != null ? maketIzdaniya.hashCode() : 0);
        result = 31 * result + (colDopIzdelii != null ? colDopIzdelii.hashCode() : 0);
        return result;
    }
}
