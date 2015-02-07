package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by DMalenkov on 26.11.2014.
 */
@Entity
public class Pantoninamashine implements Serializable {
    private long idpantoniNaMashine;
    private Long idZayavok;
    private Long idComponenti;
    private String licoOroborotPantoni;
    private String vladelecPantona;
    private String nomerPantona;
    private String naimenovaniPantona;
    private Integer procentZapechatkiPantona;
    private String postavshikPantone;
    private Date dataPostavkiPantona;

    @Id
    @Column(name = "idpantoniNaMashine", nullable = false, insertable = true, updatable = true)
    public long getIdpantoniNaMashine() {
        return idpantoniNaMashine;
    }

    public void setIdpantoniNaMashine(long idpantoniNaMashine) {
        this.idpantoniNaMashine = idpantoniNaMashine;
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
    @Column(name = "idComponenti", nullable = true, insertable = true, updatable = true)
    public Long getIdComponenti() {
        return idComponenti;
    }

    public void setIdComponenti(Long idComponenti) {
        this.idComponenti = idComponenti;
    }

    @Basic
    @Column(name = "licoOroborotPantoni", nullable = true, insertable = true, updatable = true, length = 45)
    public String getLicoOroborotPantoni() {
        return licoOroborotPantoni;
    }

    public void setLicoOroborotPantoni(String licoOroborotPantoni) {
        this.licoOroborotPantoni = licoOroborotPantoni;
    }

    @Basic
    @Column(name = "vladelecPantona", nullable = true, insertable = true, updatable = true, length = 255)
    public String getVladelecPantona() {
        return vladelecPantona;
    }

    public void setVladelecPantona(String vladelecPantona) {
        this.vladelecPantona = vladelecPantona;
    }

    @Basic
    @Column(name = "nomerPantona", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNomerPantona() {
        return nomerPantona;
    }

    public void setNomerPantona(String nomerPantona) {
        this.nomerPantona = nomerPantona;
    }

    @Basic
    @Column(name = "naimenovaniPantona", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNaimenovaniPantona() {
        return naimenovaniPantona;
    }

    public void setNaimenovaniPantona(String naimenovaniPantona) {
        this.naimenovaniPantona = naimenovaniPantona;
    }

    @Basic
    @Column(name = "procentZapechatkiPantona", nullable = true, insertable = true, updatable = true)
    public Integer getProcentZapechatkiPantona() {
        return procentZapechatkiPantona;
    }

    public void setProcentZapechatkiPantona(Integer procentZapechatkiPantona) {
        this.procentZapechatkiPantona = procentZapechatkiPantona;
    }

    @Basic
    @Column(name = "postavshikPantone", nullable = true, insertable = true, updatable = true, length = 255)
    public String getPostavshikPantone() {
        return postavshikPantone;
    }

    public void setPostavshikPantone(String postavshikPantone) {
        this.postavshikPantone = postavshikPantone;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataPostavkiPantona", nullable = true, insertable = true, updatable = true)
    public Date getDataPostavkiPantona() {
        return dataPostavkiPantona;
    }

    public void setDataPostavkiPantona(Date dataPostavkiPantona) {
        this.dataPostavkiPantona = dataPostavkiPantona;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pantoninamashine that = (Pantoninamashine) o;

        if (idpantoniNaMashine != that.idpantoniNaMashine) return false;
        if (dataPostavkiPantona != null ? !dataPostavkiPantona.equals(that.dataPostavkiPantona) : that.dataPostavkiPantona != null)
            return false;
        if (idComponenti != null ? !idComponenti.equals(that.idComponenti) : that.idComponenti != null) return false;
        if (idZayavok != null ? !idZayavok.equals(that.idZayavok) : that.idZayavok != null) return false;
        if (licoOroborotPantoni != null ? !licoOroborotPantoni.equals(that.licoOroborotPantoni) : that.licoOroborotPantoni != null)
            return false;
        if (naimenovaniPantona != null ? !naimenovaniPantona.equals(that.naimenovaniPantona) : that.naimenovaniPantona != null)
            return false;
        if (nomerPantona != null ? !nomerPantona.equals(that.nomerPantona) : that.nomerPantona != null) return false;
        if (postavshikPantone != null ? !postavshikPantone.equals(that.postavshikPantone) : that.postavshikPantone != null)
            return false;
        if (procentZapechatkiPantona != null ? !procentZapechatkiPantona.equals(that.procentZapechatkiPantona) : that.procentZapechatkiPantona != null)
            return false;
        if (vladelecPantona != null ? !vladelecPantona.equals(that.vladelecPantona) : that.vladelecPantona != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idpantoniNaMashine ^ (idpantoniNaMashine >>> 32));
        result = 31 * result + (idZayavok != null ? idZayavok.hashCode() : 0);
        result = 31 * result + (idComponenti != null ? idComponenti.hashCode() : 0);
        result = 31 * result + (licoOroborotPantoni != null ? licoOroborotPantoni.hashCode() : 0);
        result = 31 * result + (vladelecPantona != null ? vladelecPantona.hashCode() : 0);
        result = 31 * result + (nomerPantona != null ? nomerPantona.hashCode() : 0);
        result = 31 * result + (naimenovaniPantona != null ? naimenovaniPantona.hashCode() : 0);
        result = 31 * result + (procentZapechatkiPantona != null ? procentZapechatkiPantona.hashCode() : 0);
        result = 31 * result + (postavshikPantone != null ? postavshikPantone.hashCode() : 0);
        result = 31 * result + (dataPostavkiPantona != null ? dataPostavkiPantona.hashCode() : 0);
        return result;
    }
}
