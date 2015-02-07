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
public class Ypakovkagotovogoizdeliya implements Serializable {
    private long idypakovkaGotovogoIzdeliya;
    private Long idZayavok;
    private Long idoperaciiSGotovimIzdeliem;
    private Integer tirajYpakovki;
    private String colVPachkeYpakovki;
    private String tipYpakovki;
    private String tipObvyzkiYpakovki;
    private Integer colYkladok;

    @Id
    @Column(name = "idypakovkaGotovogoIzdeliya", nullable = false, insertable = true, updatable = true)
    public long getIdypakovkaGotovogoIzdeliya() {
        return idypakovkaGotovogoIzdeliya;
    }

    public void setIdypakovkaGotovogoIzdeliya(long idypakovkaGotovogoIzdeliya) {
        this.idypakovkaGotovogoIzdeliya = idypakovkaGotovogoIzdeliya;
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
    @Column(name = "idoperaciiSGotovimIzdeliem", nullable = true, insertable = true, updatable = true)
    public Long getIdoperaciiSGotovimIzdeliem() {
        return idoperaciiSGotovimIzdeliem;
    }

    public void setIdoperaciiSGotovimIzdeliem(Long idoperaciiSGotovimIzdeliem) {
        this.idoperaciiSGotovimIzdeliem = idoperaciiSGotovimIzdeliem;
    }

    @Basic
    @Column(name = "tirajYpakovki", nullable = true, insertable = true, updatable = true)
    public Integer getTirajYpakovki() {
        return tirajYpakovki;
    }

    public void setTirajYpakovki(Integer tirajYpakovki) {
        this.tirajYpakovki = tirajYpakovki;
    }

    @Basic
    @Column(name = "colVPachkeYpakovki", nullable = true, insertable = true, updatable = true, length = 255)
    public String getColVPachkeYpakovki() {
        return colVPachkeYpakovki;
    }

    public void setColVPachkeYpakovki(String colVPachkeYpakovki) {
        this.colVPachkeYpakovki = colVPachkeYpakovki;
    }

    @Basic
    @Column(name = "tipYpakovki", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTipYpakovki() {
        return tipYpakovki;
    }

    public void setTipYpakovki(String tipYpakovki) {
        this.tipYpakovki = tipYpakovki;
    }

    @Basic
    @Column(name = "tipObvyzkiYpakovki", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTipObvyzkiYpakovki() {
        return tipObvyzkiYpakovki;
    }

    public void setTipObvyzkiYpakovki(String tipObvyzkiYpakovki) {
        this.tipObvyzkiYpakovki = tipObvyzkiYpakovki;
    }

    @Basic
    @Column(name = "colYkladok", nullable = true, insertable = true, updatable = true)
    public Integer getColYkladok() {
        return colYkladok;
    }

    public void setColYkladok(Integer colYkladok) {
        this.colYkladok = colYkladok;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ypakovkagotovogoizdeliya that = (Ypakovkagotovogoizdeliya) o;

        if (idypakovkaGotovogoIzdeliya != that.idypakovkaGotovogoIzdeliya) return false;
        if (colVPachkeYpakovki != null ? !colVPachkeYpakovki.equals(that.colVPachkeYpakovki) : that.colVPachkeYpakovki != null)
            return false;
        if (colYkladok != null ? !colYkladok.equals(that.colYkladok) : that.colYkladok != null) return false;
        if (idZayavok != null ? !idZayavok.equals(that.idZayavok) : that.idZayavok != null) return false;
        if (idoperaciiSGotovimIzdeliem != null ? !idoperaciiSGotovimIzdeliem.equals(that.idoperaciiSGotovimIzdeliem) : that.idoperaciiSGotovimIzdeliem != null)
            return false;
        if (tipObvyzkiYpakovki != null ? !tipObvyzkiYpakovki.equals(that.tipObvyzkiYpakovki) : that.tipObvyzkiYpakovki != null)
            return false;
        if (tipYpakovki != null ? !tipYpakovki.equals(that.tipYpakovki) : that.tipYpakovki != null) return false;
        if (tirajYpakovki != null ? !tirajYpakovki.equals(that.tirajYpakovki) : that.tirajYpakovki != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idypakovkaGotovogoIzdeliya ^ (idypakovkaGotovogoIzdeliya >>> 32));
        result = 31 * result + (idZayavok != null ? idZayavok.hashCode() : 0);
        result = 31 * result + (idoperaciiSGotovimIzdeliem != null ? idoperaciiSGotovimIzdeliem.hashCode() : 0);
        result = 31 * result + (tirajYpakovki != null ? tirajYpakovki.hashCode() : 0);
        result = 31 * result + (colVPachkeYpakovki != null ? colVPachkeYpakovki.hashCode() : 0);
        result = 31 * result + (tipYpakovki != null ? tipYpakovki.hashCode() : 0);
        result = 31 * result + (tipObvyzkiYpakovki != null ? tipObvyzkiYpakovki.hashCode() : 0);
        result = 31 * result + (colYkladok != null ? colYkladok.hashCode() : 0);
        return result;
    }
}
