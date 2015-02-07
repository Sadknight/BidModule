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
public class Podizdaniya implements Serializable {
    private long idPodizdaniya;
    private Long idZayavok;
    private String commentPodizdaniya;
    private Integer tirajPodizdaniya;
    private Boolean operaciiSPodizdaniem;
    private Boolean signaliPodizdanie;
    private Boolean maketPodizdaniya;
    private String sostavPodizdaniya;
    private Integer colYpakovok;
    private Boolean otgryzka;

    @Id
    @Column(name = "idPodizdaniya", nullable = false, insertable = true, updatable = true)
    public long getIdPodizdaniya() {
        return idPodizdaniya;
    }

    public void setIdPodizdaniya(long idPodizdaniya) {
        this.idPodizdaniya = idPodizdaniya;
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
    @Column(name = "commentPodizdaniya", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCommentPodizdaniya() {
        return commentPodizdaniya;
    }

    public void setCommentPodizdaniya(String commentPodizdaniya) {
        this.commentPodizdaniya = commentPodizdaniya;
    }

    @Basic
    @Column(name = "tirajPodizdaniya", nullable = true, insertable = true, updatable = true)
    public Integer getTirajPodizdaniya() {
        return tirajPodizdaniya;
    }

    public void setTirajPodizdaniya(Integer tirajPodizdaniya) {
        this.tirajPodizdaniya = tirajPodizdaniya;
    }

    @Basic
    @Column(name = "operaciiSPodizdaniem", nullable = true, insertable = true, updatable = true)
    public Boolean getOperaciiSPodizdaniem() {
        return operaciiSPodizdaniem;
    }

    public void setOperaciiSPodizdaniem(Boolean operaciiSPodizdaniem) {
        this.operaciiSPodizdaniem = operaciiSPodizdaniem;
    }

    @Basic
    @Column(name = "signaliPodizdanie", nullable = true, insertable = true, updatable = true)
    public Boolean getSignaliPodizdanie() {
        return signaliPodizdanie;
    }

    public void setSignaliPodizdanie(Boolean signaliPodizdanie) {
        this.signaliPodizdanie = signaliPodizdanie;
    }

    @Basic
    @Column(name = "maketPodizdaniya", nullable = true, insertable = true, updatable = true)
    public Boolean getMaketPodizdaniya() {
        return maketPodizdaniya;
    }

    public void setMaketPodizdaniya(Boolean maketPodizdaniya) {
        this.maketPodizdaniya = maketPodizdaniya;
    }

    @Basic
    @Column(name = "sostavPodizdaniya", nullable = true, insertable = true, updatable = true, length = 500)
    public String getSostavPodizdaniya() {
        return sostavPodizdaniya;
    }

    public void setSostavPodizdaniya(String sostavPodizdaniya) {
        this.sostavPodizdaniya = sostavPodizdaniya;
    }

    @Basic
    @Column(name = "colYpakovok", nullable = true, insertable = true, updatable = true)
    public Integer getColYpakovok() {
        return colYpakovok;
    }

    public void setColYpakovok(Integer colYpakovok) {
        this.colYpakovok = colYpakovok;
    }

    @Basic
    @Column(name = "otgryzka", nullable = true, insertable = true, updatable = true)
    public Boolean getOtgryzka() {
        return otgryzka;
    }

    public void setOtgryzka(Boolean otgryzka) {
        this.otgryzka = otgryzka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Podizdaniya that = (Podizdaniya) o;

        if (idPodizdaniya != that.idPodizdaniya) return false;
        if (colYpakovok != null ? !colYpakovok.equals(that.colYpakovok) : that.colYpakovok != null) return false;
        if (commentPodizdaniya != null ? !commentPodizdaniya.equals(that.commentPodizdaniya) : that.commentPodizdaniya != null)
            return false;
        if (idZayavok != null ? !idZayavok.equals(that.idZayavok) : that.idZayavok != null) return false;
        if (maketPodizdaniya != null ? !maketPodizdaniya.equals(that.maketPodizdaniya) : that.maketPodizdaniya != null)
            return false;
        if (operaciiSPodizdaniem != null ? !operaciiSPodizdaniem.equals(that.operaciiSPodizdaniem) : that.operaciiSPodizdaniem != null)
            return false;
        if (otgryzka != null ? !otgryzka.equals(that.otgryzka) : that.otgryzka != null) return false;
        if (signaliPodizdanie != null ? !signaliPodizdanie.equals(that.signaliPodizdanie) : that.signaliPodizdanie != null)
            return false;
        if (sostavPodizdaniya != null ? !sostavPodizdaniya.equals(that.sostavPodizdaniya) : that.sostavPodizdaniya != null)
            return false;
        if (tirajPodizdaniya != null ? !tirajPodizdaniya.equals(that.tirajPodizdaniya) : that.tirajPodizdaniya != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idPodizdaniya ^ (idPodizdaniya >>> 32));
        result = 31 * result + (idZayavok != null ? idZayavok.hashCode() : 0);
        result = 31 * result + (commentPodizdaniya != null ? commentPodizdaniya.hashCode() : 0);
        result = 31 * result + (tirajPodizdaniya != null ? tirajPodizdaniya.hashCode() : 0);
        result = 31 * result + (operaciiSPodizdaniem != null ? operaciiSPodizdaniem.hashCode() : 0);
        result = 31 * result + (signaliPodizdanie != null ? signaliPodizdanie.hashCode() : 0);
        result = 31 * result + (maketPodizdaniya != null ? maketPodizdaniya.hashCode() : 0);
        result = 31 * result + (sostavPodizdaniya != null ? sostavPodizdaniya.hashCode() : 0);
        result = 31 * result + (colYpakovok != null ? colYpakovok.hashCode() : 0);
        result = 31 * result + (otgryzka != null ? otgryzka.hashCode() : 0);
        return result;
    }
}
