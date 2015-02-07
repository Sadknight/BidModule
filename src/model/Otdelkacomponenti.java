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
public class Otdelkacomponenti implements Serializable {
    private int idotdelkaComponenti;
    private Long idZayavok;
    private Long idComponenti;
    private String ispolnitelOtdelki;
    private String nameIspolniteliaOtdelki;
    private Integer idOperaciiOtdelki;
    private Integer tirajOtdelki;
    private Double stoimostOtdelki;
    private String naimenovanieOtdelki;

    @Id
    @Column(name = "idotdelkaComponenti", nullable = false, insertable = true, updatable = true)
    public int getIdotdelkaComponenti() {
        return idotdelkaComponenti;
    }

    public void setIdotdelkaComponenti(int idotdelkaComponenti) {
        this.idotdelkaComponenti = idotdelkaComponenti;
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
    @Column(name = "ispolnitelOtdelki", nullable = true, insertable = true, updatable = true, length = 255)
    public String getIspolnitelOtdelki() {
        return ispolnitelOtdelki;
    }

    public void setIspolnitelOtdelki(String ispolnitelOtdelki) {
        this.ispolnitelOtdelki = ispolnitelOtdelki;
    }

    @Basic
    @Column(name = "nameIspolniteliaOtdelki", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNameIspolniteliaOtdelki() {
        return nameIspolniteliaOtdelki;
    }

    public void setNameIspolniteliaOtdelki(String nameIspolniteliaOtdelki) {
        this.nameIspolniteliaOtdelki = nameIspolniteliaOtdelki;
    }

    @Basic
    @Column(name = "idOperaciiOtdelki", nullable = true, insertable = true, updatable = true)
    public Integer getIdOperaciiOtdelki() {
        return idOperaciiOtdelki;
    }

    public void setIdOperaciiOtdelki(Integer idOperaciiOtdelki) {
        this.idOperaciiOtdelki = idOperaciiOtdelki;
    }

    @Basic
    @Column(name = "tirajOtdelki", nullable = true, insertable = true, updatable = true)
    public Integer getTirajOtdelki() {
        return tirajOtdelki;
    }

    public void setTirajOtdelki(Integer tirajOtdelki) {
        this.tirajOtdelki = tirajOtdelki;
    }

    @Basic
    @Column(name = "stoimostOtdelki", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getStoimostOtdelki() {
        return stoimostOtdelki;
    }

    public void setStoimostOtdelki(Double stoimostOtdelki) {
        this.stoimostOtdelki = stoimostOtdelki;
    }

    @Basic
    @Column(name = "naimenovanieOtdelki", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNaimenovanieOtdelki() {
        return naimenovanieOtdelki;
    }

    public void setNaimenovanieOtdelki(String naimenovanieOtdelki) {
        this.naimenovanieOtdelki = naimenovanieOtdelki;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Otdelkacomponenti that = (Otdelkacomponenti) o;

        if (idotdelkaComponenti != that.idotdelkaComponenti) return false;
        if (idComponenti != null ? !idComponenti.equals(that.idComponenti) : that.idComponenti != null) return false;
        if (idOperaciiOtdelki != null ? !idOperaciiOtdelki.equals(that.idOperaciiOtdelki) : that.idOperaciiOtdelki != null)
            return false;
        if (idZayavok != null ? !idZayavok.equals(that.idZayavok) : that.idZayavok != null) return false;
        if (ispolnitelOtdelki != null ? !ispolnitelOtdelki.equals(that.ispolnitelOtdelki) : that.ispolnitelOtdelki != null)
            return false;
        if (naimenovanieOtdelki != null ? !naimenovanieOtdelki.equals(that.naimenovanieOtdelki) : that.naimenovanieOtdelki != null)
            return false;
        if (nameIspolniteliaOtdelki != null ? !nameIspolniteliaOtdelki.equals(that.nameIspolniteliaOtdelki) : that.nameIspolniteliaOtdelki != null)
            return false;
        if (stoimostOtdelki != null ? !stoimostOtdelki.equals(that.stoimostOtdelki) : that.stoimostOtdelki != null)
            return false;
        if (tirajOtdelki != null ? !tirajOtdelki.equals(that.tirajOtdelki) : that.tirajOtdelki != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idotdelkaComponenti;
        result = 31 * result + (idZayavok != null ? idZayavok.hashCode() : 0);
        result = 31 * result + (idComponenti != null ? idComponenti.hashCode() : 0);
        result = 31 * result + (ispolnitelOtdelki != null ? ispolnitelOtdelki.hashCode() : 0);
        result = 31 * result + (nameIspolniteliaOtdelki != null ? nameIspolniteliaOtdelki.hashCode() : 0);
        result = 31 * result + (idOperaciiOtdelki != null ? idOperaciiOtdelki.hashCode() : 0);
        result = 31 * result + (tirajOtdelki != null ? tirajOtdelki.hashCode() : 0);
        result = 31 * result + (stoimostOtdelki != null ? stoimostOtdelki.hashCode() : 0);
        result = 31 * result + (naimenovanieOtdelki != null ? naimenovanieOtdelki.hashCode() : 0);
        return result;
    }
}
