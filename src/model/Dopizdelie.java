package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by DMalenkov on 26.11.2014.
 */
@Entity
public class Dopizdelie implements Serializable {
    private long idDopizdelie;
    private Long idZayavok;
    private Long idKontragenta;
    private String commentIzdanie;
    private Integer colComponent;
    private Integer colPodizdanii;
    private String managerCreat;
    private Date dateBegin;
    private Date dateEnd;
    private String tipIzdeliya;
    private Integer format1;
    private Integer format2;
    private Integer tiraj;
    private Boolean operaciiSIzdeliem;
    private Boolean maketIzdaniya;

    @Id
    @Column(name = "idDopizdelie", nullable = false, insertable = true, updatable = true)
    public long getIdDopizdelie() {
        return idDopizdelie;
    }

    public void setIdDopizdelie(long idDopizdelie) {
        this.idDopizdelie = idDopizdelie;
    }

    @Basic
    @Column(name = "idZayavok", nullable = true, insertable = true, updatable = true)
    public Long getIdZayavok() {
        return idZayavok;
    }

    public void setIdZayavok(Long idZayavok) {
        this.idZayavok = idZayavok;
    }

    @Basic
    @Column(name = "idKontragenta", nullable = true, insertable = true, updatable = true)
    public Long getIdKontragenta() {
        return idKontragenta;
    }

    public void setIdKontragenta(Long idKontragenta) {
        this.idKontragenta = idKontragenta;
    }

    @Basic
    @Column(name = "commentIzdanie", nullable = true, insertable = true, updatable = true, length = 45)
    public String getCommentIzdanie() {
        return commentIzdanie;
    }

    public void setCommentIzdanie(String commentIzdanie) {
        this.commentIzdanie = commentIzdanie;
    }

    @Basic
    @Column(name = "colComponent", nullable = true, insertable = true, updatable = true)
    public Integer getColComponent() {
        return colComponent;
    }

    public void setColComponent(Integer colComponent) {
        this.colComponent = colComponent;
    }

    @Basic
    @Column(name = "colPodizdanii", nullable = true, insertable = true, updatable = true)
    public Integer getColPodizdanii() {
        return colPodizdanii;
    }

    public void setColPodizdanii(Integer colPodizdanii) {
        this.colPodizdanii = colPodizdanii;
    }

    @Basic
    @Column(name = "ManagerCreat", nullable = true, insertable = true, updatable = true, length = 255)
    public String getManagerCreat() {
        return managerCreat;
    }

    public void setManagerCreat(String managerCreat) {
        this.managerCreat = managerCreat;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dateBegin", nullable = true, insertable = true, updatable = true)
    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dateEnd", nullable = true, insertable = true, updatable = true)
    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Basic
    @Column(name = "tipIzdeliya", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTipIzdeliya() {
        return tipIzdeliya;
    }

    public void setTipIzdeliya(String tipIzdeliya) {
        this.tipIzdeliya = tipIzdeliya;
    }

    @Basic
    @Column(name = "format1", nullable = true, insertable = true, updatable = true)
    public Integer getFormat1() {
        return format1;
    }

    public void setFormat1(Integer format1) {
        this.format1 = format1;
    }

    @Basic
    @Column(name = "format2", nullable = true, insertable = true, updatable = true)
    public Integer getFormat2() {
        return format2;
    }

    public void setFormat2(Integer format2) {
        this.format2 = format2;
    }

    @Basic
    @Column(name = "tiraj", nullable = true, insertable = true, updatable = true)
    public Integer getTiraj() {
        return tiraj;
    }

    public void setTiraj(Integer tiraj) {
        this.tiraj = tiraj;
    }

    @Basic
    @Column(name = "operaciiSIzdeliem", nullable = true, insertable = true, updatable = true)
    public Boolean getOperaciiSIzdeliem() {
        return operaciiSIzdeliem;
    }

    public void setOperaciiSIzdeliem(Boolean operaciiSIzdeliem) {
        this.operaciiSIzdeliem = operaciiSIzdeliem;
    }

    @Basic
    @Column(name = "maketIzdaniya", nullable = true, insertable = true, updatable = true)
    public Boolean getMaketIzdaniya() {
        return maketIzdaniya;
    }

    public void setMaketIzdaniya(Boolean maketIzdaniya) {
        this.maketIzdaniya = maketIzdaniya;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dopizdelie that = (Dopizdelie) o;

        if (idDopizdelie != that.idDopizdelie) return false;
        if (colComponent != null ? !colComponent.equals(that.colComponent) : that.colComponent != null) return false;
        if (colPodizdanii != null ? !colPodizdanii.equals(that.colPodizdanii) : that.colPodizdanii != null)
            return false;
        if (commentIzdanie != null ? !commentIzdanie.equals(that.commentIzdanie) : that.commentIzdanie != null)
            return false;
        if (dateBegin != null ? !dateBegin.equals(that.dateBegin) : that.dateBegin != null) return false;
        if (dateEnd != null ? !dateEnd.equals(that.dateEnd) : that.dateEnd != null) return false;
        if (format1 != null ? !format1.equals(that.format1) : that.format1 != null) return false;
        if (format2 != null ? !format2.equals(that.format2) : that.format2 != null) return false;
        if (idKontragenta != null ? !idKontragenta.equals(that.idKontragenta) : that.idKontragenta != null)
            return false;
        if (idZayavok != null ? !idZayavok.equals(that.idZayavok) : that.idZayavok != null) return false;
        if (maketIzdaniya != null ? !maketIzdaniya.equals(that.maketIzdaniya) : that.maketIzdaniya != null)
            return false;
        if (managerCreat != null ? !managerCreat.equals(that.managerCreat) : that.managerCreat != null) return false;
        if (operaciiSIzdeliem != null ? !operaciiSIzdeliem.equals(that.operaciiSIzdeliem) : that.operaciiSIzdeliem != null)
            return false;
        if (tipIzdeliya != null ? !tipIzdeliya.equals(that.tipIzdeliya) : that.tipIzdeliya != null) return false;
        if (tiraj != null ? !tiraj.equals(that.tiraj) : that.tiraj != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idDopizdelie ^ (idDopizdelie >>> 32));
        result = 31 * result + (idZayavok != null ? idZayavok.hashCode() : 0);
        result = 31 * result + (idKontragenta != null ? idKontragenta.hashCode() : 0);
        result = 31 * result + (commentIzdanie != null ? commentIzdanie.hashCode() : 0);
        result = 31 * result + (colComponent != null ? colComponent.hashCode() : 0);
        result = 31 * result + (colPodizdanii != null ? colPodizdanii.hashCode() : 0);
        result = 31 * result + (managerCreat != null ? managerCreat.hashCode() : 0);
        result = 31 * result + (dateBegin != null ? dateBegin.hashCode() : 0);
        result = 31 * result + (dateEnd != null ? dateEnd.hashCode() : 0);
        result = 31 * result + (tipIzdeliya != null ? tipIzdeliya.hashCode() : 0);
        result = 31 * result + (format1 != null ? format1.hashCode() : 0);
        result = 31 * result + (format2 != null ? format2.hashCode() : 0);
        result = 31 * result + (tiraj != null ? tiraj.hashCode() : 0);
        result = 31 * result + (operaciiSIzdeliem != null ? operaciiSIzdeliem.hashCode() : 0);
        result = 31 * result + (maketIzdaniya != null ? maketIzdaniya.hashCode() : 0);
        return result;
    }
}
