package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by DMalenkov on 26.11.2014.
 */
@Entity
public class Operaciisgotovimizdeliem implements Serializable {
    private long idoperaciiSGotovimIzdeliem;
    private Long idZayavok;
    private Long idbroshyrovkaPodizdaniya;
    private String tirajOperacii;
    private Integer idOperaciiSgIzdeliem;
    private String ispolnitelOperaciiSGizdeliem;
    private String davalceskoeOsgi;
    private Date dataPrixodaMaterialov;
    private Long idPodizdaniya;

    @Id
    @Column(name = "idPodizdaniya", nullable = false, insertable = true, updatable = true)
    public Long getIdPodizdaniya() {
        return idPodizdaniya;
    }

    public void setIdPodizdaniya(Long idPodizdaniya) {
        this.idPodizdaniya = idPodizdaniya;
    }

    @Id
    @Column(name = "idoperaciiSGotovimIzdeliem", nullable = false, insertable = true, updatable = true)
    public long getIdoperaciiSGotovimIzdeliem() {
        return idoperaciiSGotovimIzdeliem;
    }

    public void setIdoperaciiSGotovimIzdeliem(long idoperaciiSGotovimIzdeliem) {
        this.idoperaciiSGotovimIzdeliem = idoperaciiSGotovimIzdeliem;
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
    @Column(name = "idbroshyrovkaPodizdaniya", nullable = true, insertable = true, updatable = true)
    public Long getIdbroshyrovkaPodizdaniya() {
        return idbroshyrovkaPodizdaniya;
    }

    public void setIdbroshyrovkaPodizdaniya(Long idbroshyrovkaPodizdaniya) {
        this.idbroshyrovkaPodizdaniya = idbroshyrovkaPodizdaniya;
    }

    @Basic
    @Column(name = "tirajOperacii", nullable = true, insertable = true, updatable = true, length = 45)
    public String getTirajOperacii() {
        return tirajOperacii;
    }

    public void setTirajOperacii(String tirajOperacii) {
        this.tirajOperacii = tirajOperacii;
    }

    @Basic
    @Column(name = "idOperaciiSGIzdeliem", nullable = true, insertable = true, updatable = true)
    public Integer getIdOperaciiSgIzdeliem() {
        return idOperaciiSgIzdeliem;
    }

    public void setIdOperaciiSgIzdeliem(Integer idOperaciiSgIzdeliem) {
        this.idOperaciiSgIzdeliem = idOperaciiSgIzdeliem;
    }

    @Basic
    @Column(name = "ispolnitelOperaciiSGizdeliem", nullable = true, insertable = true, updatable = true, length = 255)
    public String getIspolnitelOperaciiSGizdeliem() {
        return ispolnitelOperaciiSGizdeliem;
    }

    public void setIspolnitelOperaciiSGizdeliem(String ispolnitelOperaciiSGizdeliem) {
        this.ispolnitelOperaciiSGizdeliem = ispolnitelOperaciiSGizdeliem;
    }

    @Basic
    @Column(name = "davalceskoeOSGI", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDavalceskoeOsgi() {
        return davalceskoeOsgi;
    }

    public void setDavalceskoeOsgi(String davalceskoeOsgi) {
        this.davalceskoeOsgi = davalceskoeOsgi;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataPrixodaMaterialov", nullable = true, insertable = true, updatable = true)
    public Date getDataPrixodaMaterialov() {
        return dataPrixodaMaterialov;
    }

    public void setDataPrixodaMaterialov(Date dataPrixodaMaterialov) {
        this.dataPrixodaMaterialov = dataPrixodaMaterialov;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operaciisgotovimizdeliem that = (Operaciisgotovimizdeliem) o;

        if (idoperaciiSGotovimIzdeliem != that.idoperaciiSGotovimIzdeliem) return false;
        if (dataPrixodaMaterialov != null ? !dataPrixodaMaterialov.equals(that.dataPrixodaMaterialov) : that.dataPrixodaMaterialov != null)
            return false;
        if (davalceskoeOsgi != null ? !davalceskoeOsgi.equals(that.davalceskoeOsgi) : that.davalceskoeOsgi != null)
            return false;
        if (idOperaciiSgIzdeliem != null ? !idOperaciiSgIzdeliem.equals(that.idOperaciiSgIzdeliem) : that.idOperaciiSgIzdeliem != null)
            return false;
        if (idZayavok != null ? !idZayavok.equals(that.idZayavok) : that.idZayavok != null) return false;
        if (idbroshyrovkaPodizdaniya != null ? !idbroshyrovkaPodizdaniya.equals(that.idbroshyrovkaPodizdaniya) : that.idbroshyrovkaPodizdaniya != null)
            return false;
        if (ispolnitelOperaciiSGizdeliem != null ? !ispolnitelOperaciiSGizdeliem.equals(that.ispolnitelOperaciiSGizdeliem) : that.ispolnitelOperaciiSGizdeliem != null)
            return false;
        if (tirajOperacii != null ? !tirajOperacii.equals(that.tirajOperacii) : that.tirajOperacii != null)
            return false;
        if (idPodizdaniya != null ? !idPodizdaniya.equals(that.idPodizdaniya) : that.idPodizdaniya != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idoperaciiSGotovimIzdeliem ^ (idoperaciiSGotovimIzdeliem >>> 32));
        result = 31 * result + (idPodizdaniya != null ? idPodizdaniya.hashCode() : 0);
        result = 31 * result + (idZayavok != null ? idZayavok.hashCode() : 0);
        result = 31 * result + (idbroshyrovkaPodizdaniya != null ? idbroshyrovkaPodizdaniya.hashCode() : 0);
        result = 31 * result + (tirajOperacii != null ? tirajOperacii.hashCode() : 0);
        result = 31 * result + (idOperaciiSgIzdeliem != null ? idOperaciiSgIzdeliem.hashCode() : 0);
        result = 31 * result + (ispolnitelOperaciiSGizdeliem != null ? ispolnitelOperaciiSGizdeliem.hashCode() : 0);
        result = 31 * result + (davalceskoeOsgi != null ? davalceskoeOsgi.hashCode() : 0);
        result = 31 * result + (dataPrixodaMaterialov != null ? dataPrixodaMaterialov.hashCode() : 0);
        return result;
    }
}
