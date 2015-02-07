package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by DMalenkov on 26.11.2014.
 */
@Entity
public class Broshyrovkapodizdaniya implements Serializable {
    private long idbroshyrovkaPodizdaniya;
    private Long idZayavok;
    private Long idPodizdaniya;
    private Integer tirajBroshyrovki;
    private Integer idOperaciiBroshyrovki;
    private String priznakSkrepleniyaBroshyrovki;
    private String oborydovanieBroshyrovki;

    @Id
    @Column(name = "idbroshyrovkaPodizdaniya", nullable = false, insertable = true, updatable = true)
    public long getIdbroshyrovkaPodizdaniya() {
        return idbroshyrovkaPodizdaniya;
    }

    public void setIdbroshyrovkaPodizdaniya(long idbroshyrovkaPodizdaniya) {
        this.idbroshyrovkaPodizdaniya = idbroshyrovkaPodizdaniya;
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
    @Column(name = "idPodizdaniya", nullable = true, insertable = true, updatable = true)
    public Long getIdPodizdaniya() {
        return idPodizdaniya;
    }

    public void setIdPodizdaniya(Long idPodizdaniya) {
        this.idPodizdaniya = idPodizdaniya;
    }

    @Basic
    @Column(name = "tirajBroshyrovki", nullable = true, insertable = true, updatable = true)
    public Integer getTirajBroshyrovki() {
        return tirajBroshyrovki;
    }

    public void setTirajBroshyrovki(Integer tirajBroshyrovki) {
        this.tirajBroshyrovki = tirajBroshyrovki;
    }

    @Basic
    @Column(name = "idOperaciiBroshyrovki", nullable = true, insertable = true, updatable = true)
    public Integer getIdOperaciiBroshyrovki() {
        return idOperaciiBroshyrovki;
    }

    public void setIdOperaciiBroshyrovki(Integer idOperaciiBroshyrovki) {
        this.idOperaciiBroshyrovki = idOperaciiBroshyrovki;
    }

    @Basic
    @Column(name = "priznakSkrepleniyaBroshyrovki", nullable = true, insertable = true, updatable = true, length = 255)
    public String getPriznakSkrepleniyaBroshyrovki() {
        return priznakSkrepleniyaBroshyrovki;
    }

    public void setPriznakSkrepleniyaBroshyrovki(String priznakSkrepleniyaBroshyrovki) {
        this.priznakSkrepleniyaBroshyrovki = priznakSkrepleniyaBroshyrovki;
    }

    @Basic
    @Column(name = "oborydovanieBroshyrovki", nullable = true, insertable = true, updatable = true, length = 255)
    public String getOborydovanieBroshyrovki() {
        return oborydovanieBroshyrovki;
    }

    public void setOborydovanieBroshyrovki(String oborydovanieBroshyrovki) {
        this.oborydovanieBroshyrovki = oborydovanieBroshyrovki;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Broshyrovkapodizdaniya that = (Broshyrovkapodizdaniya) o;

        if (idbroshyrovkaPodizdaniya != that.idbroshyrovkaPodizdaniya) return false;
        if (idOperaciiBroshyrovki != null ? !idOperaciiBroshyrovki.equals(that.idOperaciiBroshyrovki) : that.idOperaciiBroshyrovki != null)
            return false;
        if (idPodizdaniya != null ? !idPodizdaniya.equals(that.idPodizdaniya) : that.idPodizdaniya != null)
            return false;
        if (idZayavok != null ? !idZayavok.equals(that.idZayavok) : that.idZayavok != null) return false;
        if (oborydovanieBroshyrovki != null ? !oborydovanieBroshyrovki.equals(that.oborydovanieBroshyrovki) : that.oborydovanieBroshyrovki != null)
            return false;
        if (priznakSkrepleniyaBroshyrovki != null ? !priznakSkrepleniyaBroshyrovki.equals(that.priznakSkrepleniyaBroshyrovki) : that.priznakSkrepleniyaBroshyrovki != null)
            return false;
        if (tirajBroshyrovki != null ? !tirajBroshyrovki.equals(that.tirajBroshyrovki) : that.tirajBroshyrovki != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idbroshyrovkaPodizdaniya ^ (idbroshyrovkaPodizdaniya >>> 32));
        result = 31 * result + (idZayavok != null ? idZayavok.hashCode() : 0);
        result = 31 * result + (idPodizdaniya != null ? idPodizdaniya.hashCode() : 0);
        result = 31 * result + (tirajBroshyrovki != null ? tirajBroshyrovki.hashCode() : 0);
        result = 31 * result + (idOperaciiBroshyrovki != null ? idOperaciiBroshyrovki.hashCode() : 0);
        result = 31 * result + (priznakSkrepleniyaBroshyrovki != null ? priznakSkrepleniyaBroshyrovki.hashCode() : 0);
        result = 31 * result + (oborydovanieBroshyrovki != null ? oborydovanieBroshyrovki.hashCode() : 0);
        return result;
    }
}
