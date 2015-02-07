package model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by DMalenkov on 26.11.2014.
 */
@Entity
public class Ykladkanapaleti implements Serializable {
    private long idykladkaNaPaleti;
    private Long idZayavok;
    private Long idypakovkaGotovogoIzdeliya;
    private Integer tirajYkladkiPachek;
    private String vidPaletiYkladki;
    private Integer maxColNaPalete;
    private Integer maxVesYkladki;
    private Integer maxVisotaYkladki;
    private String colPaletYkladki;
    private Boolean standartnayaYpakovkaYkladka;
    private Boolean kartonieYgolkiYkladki;
    private Boolean kartonayaKrishkaYkladki;
    private Boolean derevynnayaKrishkaYkladki;
    private Boolean strepingYkladki;
    private Integer colDostavok;

    @Id
    @javax.persistence.Column(name = "idykladkaNaPaleti", nullable = false, insertable = true, updatable = true)
    public long getIdykladkaNaPaleti() {
        return idykladkaNaPaleti;
    }

    public void setIdykladkaNaPaleti(long idykladkaNaPaleti) {
        this.idykladkaNaPaleti = idykladkaNaPaleti;
    }

    @Basic
    @javax.persistence.Column(name = "idZayavok", nullable = true, insertable = true, updatable = true)
    public Long getIdZayavok() {
        return idZayavok;
    }

    public void setIdZayavok(Long idZayavok) {
        this.idZayavok = idZayavok;
    }

    @Basic
    @javax.persistence.Column(name = "idypakovkaGotovogoIzdeliya", nullable = true, insertable = true, updatable = true)
    public Long getIdypakovkaGotovogoIzdeliya() {
        return idypakovkaGotovogoIzdeliya;
    }

    public void setIdypakovkaGotovogoIzdeliya(Long idypakovkaGotovogoIzdeliya) {
        this.idypakovkaGotovogoIzdeliya = idypakovkaGotovogoIzdeliya;
    }

    @Basic
    @javax.persistence.Column(name = "tirajYkladkiPachek", nullable = true, insertable = true, updatable = true)
    public Integer getTirajYkladkiPachek() {
        return tirajYkladkiPachek;
    }

    public void setTirajYkladkiPachek(Integer tirajYkladkiPachek) {
        this.tirajYkladkiPachek = tirajYkladkiPachek;
    }

    @Basic
    @javax.persistence.Column(name = "vidPaletiYkladki", nullable = true, insertable = true, updatable = true, length = 255)
    public String getVidPaletiYkladki() {
        return vidPaletiYkladki;
    }

    public void setVidPaletiYkladki(String vidPaletiYkladki) {
        this.vidPaletiYkladki = vidPaletiYkladki;
    }

    @Basic
    @javax.persistence.Column(name = "maxColNaPalete", nullable = true, insertable = true, updatable = true)
    public Integer getMaxColNaPalete() {
        return maxColNaPalete;
    }

    public void setMaxColNaPalete(Integer maxColNaPalete) {
        this.maxColNaPalete = maxColNaPalete;
    }

    @Basic
    @javax.persistence.Column(name = "maxVesYkladki", nullable = true, insertable = true, updatable = true)
    public Integer getMaxVesYkladki() {
        return maxVesYkladki;
    }

    public void setMaxVesYkladki(Integer maxVesYkladki) {
        this.maxVesYkladki = maxVesYkladki;
    }

    @Basic
    @javax.persistence.Column(name = "maxVisotaYkladki", nullable = true, insertable = true, updatable = true)
    public Integer getMaxVisotaYkladki() {
        return maxVisotaYkladki;
    }

    public void setMaxVisotaYkladki(Integer maxVisotaYkladki) {
        this.maxVisotaYkladki = maxVisotaYkladki;
    }

    @Basic
    @javax.persistence.Column(name = "colPaletYkladki", nullable = true, insertable = true, updatable = true, length = 255)
    public String getColPaletYkladki() {
        return colPaletYkladki;
    }

    public void setColPaletYkladki(String colPaletYkladki) {
        this.colPaletYkladki = colPaletYkladki;
    }

    @Basic
    @javax.persistence.Column(name = "standartnayaYpakovkaYkladka", nullable = true, insertable = true, updatable = true)
    public Boolean getStandartnayaYpakovkaYkladka() {
        return standartnayaYpakovkaYkladka;
    }

    public void setStandartnayaYpakovkaYkladka(Boolean standartnayaYpakovkaYkladka) {
        this.standartnayaYpakovkaYkladka = standartnayaYpakovkaYkladka;
    }

    @Basic
    @javax.persistence.Column(name = "kartonieYgolkiYkladki", nullable = true, insertable = true, updatable = true)
    public Boolean getKartonieYgolkiYkladki() {
        return kartonieYgolkiYkladki;
    }

    public void setKartonieYgolkiYkladki(Boolean kartonieYgolkiYkladki) {
        this.kartonieYgolkiYkladki = kartonieYgolkiYkladki;
    }

    @Basic
    @javax.persistence.Column(name = "kartonayaKrishkaYkladki", nullable = true, insertable = true, updatable = true)
    public Boolean getKartonayaKrishkaYkladki() {
        return kartonayaKrishkaYkladki;
    }

    public void setKartonayaKrishkaYkladki(Boolean kartonayaKrishkaYkladki) {
        this.kartonayaKrishkaYkladki = kartonayaKrishkaYkladki;
    }

    @Basic
    @javax.persistence.Column(name = "derevynnayaKrishkaYkladki", nullable = true, insertable = true, updatable = true)
    public Boolean getDerevynnayaKrishkaYkladki() {
        return derevynnayaKrishkaYkladki;
    }

    public void setDerevynnayaKrishkaYkladki(Boolean derevynnayaKrishkaYkladki) {
        this.derevynnayaKrishkaYkladki = derevynnayaKrishkaYkladki;
    }

    @Basic
    @javax.persistence.Column(name = "strepingYkladki", nullable = true, insertable = true, updatable = true)
    public Boolean getStrepingYkladki() {
        return strepingYkladki;
    }

    public void setStrepingYkladki(Boolean strepingYkladki) {
        this.strepingYkladki = strepingYkladki;
    }

    @Basic
    @javax.persistence.Column(name = "colDostavok", nullable = true, insertable = true, updatable = true)
    public Integer getColDostavok() {
        return colDostavok;
    }

    public void setColDostavok(Integer colDostavok) {
        this.colDostavok = colDostavok;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ykladkanapaleti that = (Ykladkanapaleti) o;

        if (idykladkaNaPaleti != that.idykladkaNaPaleti) return false;
        if (colDostavok != null ? !colDostavok.equals(that.colDostavok) : that.colDostavok != null) return false;
        if (colPaletYkladki != null ? !colPaletYkladki.equals(that.colPaletYkladki) : that.colPaletYkladki != null)
            return false;
        if (derevynnayaKrishkaYkladki != null ? !derevynnayaKrishkaYkladki.equals(that.derevynnayaKrishkaYkladki) : that.derevynnayaKrishkaYkladki != null)
            return false;
        if (idZayavok != null ? !idZayavok.equals(that.idZayavok) : that.idZayavok != null) return false;
        if (idypakovkaGotovogoIzdeliya != null ? !idypakovkaGotovogoIzdeliya.equals(that.idypakovkaGotovogoIzdeliya) : that.idypakovkaGotovogoIzdeliya != null)
            return false;
        if (kartonayaKrishkaYkladki != null ? !kartonayaKrishkaYkladki.equals(that.kartonayaKrishkaYkladki) : that.kartonayaKrishkaYkladki != null)
            return false;
        if (kartonieYgolkiYkladki != null ? !kartonieYgolkiYkladki.equals(that.kartonieYgolkiYkladki) : that.kartonieYgolkiYkladki != null)
            return false;
        if (maxColNaPalete != null ? !maxColNaPalete.equals(that.maxColNaPalete) : that.maxColNaPalete != null)
            return false;
        if (maxVesYkladki != null ? !maxVesYkladki.equals(that.maxVesYkladki) : that.maxVesYkladki != null)
            return false;
        if (maxVisotaYkladki != null ? !maxVisotaYkladki.equals(that.maxVisotaYkladki) : that.maxVisotaYkladki != null)
            return false;
        if (standartnayaYpakovkaYkladka != null ? !standartnayaYpakovkaYkladka.equals(that.standartnayaYpakovkaYkladka) : that.standartnayaYpakovkaYkladka != null)
            return false;
        if (strepingYkladki != null ? !strepingYkladki.equals(that.strepingYkladki) : that.strepingYkladki != null)
            return false;
        if (tirajYkladkiPachek != null ? !tirajYkladkiPachek.equals(that.tirajYkladkiPachek) : that.tirajYkladkiPachek != null)
            return false;
        if (vidPaletiYkladki != null ? !vidPaletiYkladki.equals(that.vidPaletiYkladki) : that.vidPaletiYkladki != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idykladkaNaPaleti ^ (idykladkaNaPaleti >>> 32));
        result = 31 * result + (idZayavok != null ? idZayavok.hashCode() : 0);
        result = 31 * result + (idypakovkaGotovogoIzdeliya != null ? idypakovkaGotovogoIzdeliya.hashCode() : 0);
        result = 31 * result + (tirajYkladkiPachek != null ? tirajYkladkiPachek.hashCode() : 0);
        result = 31 * result + (vidPaletiYkladki != null ? vidPaletiYkladki.hashCode() : 0);
        result = 31 * result + (maxColNaPalete != null ? maxColNaPalete.hashCode() : 0);
        result = 31 * result + (maxVesYkladki != null ? maxVesYkladki.hashCode() : 0);
        result = 31 * result + (maxVisotaYkladki != null ? maxVisotaYkladki.hashCode() : 0);
        result = 31 * result + (colPaletYkladki != null ? colPaletYkladki.hashCode() : 0);
        result = 31 * result + (standartnayaYpakovkaYkladka != null ? standartnayaYpakovkaYkladka.hashCode() : 0);
        result = 31 * result + (kartonieYgolkiYkladki != null ? kartonieYgolkiYkladki.hashCode() : 0);
        result = 31 * result + (kartonayaKrishkaYkladki != null ? kartonayaKrishkaYkladki.hashCode() : 0);
        result = 31 * result + (derevynnayaKrishkaYkladki != null ? derevynnayaKrishkaYkladki.hashCode() : 0);
        result = 31 * result + (strepingYkladki != null ? strepingYkladki.hashCode() : 0);
        result = 31 * result + (colDostavok != null ? colDostavok.hashCode() : 0);
        return result;
    }
}
