package model;

import javax.persistence.*;

/**
 * Created by DMalenkov on 27.11.2014.
 */
@Entity
@Table(name = "reestr_izdanii", schema = "", catalog = "bid")
public class ReestrIzdanii {
    private long idreestrIzdanii;
    private Long idDogovora;
    private Long idKontrAgent;
    private String nameIzd;
    private String periodichnost;
    private String ca;
    private String tema;
    private String auditoria;
    private String construction;
    private String commentIzdanii;
    private String clientname;

    @Id
    @Column(name = "idreestr_izdanii", nullable = false, insertable = true, updatable = true)
    public long getIdreestrIzdanii() {
        return idreestrIzdanii;
    }

    public void setIdreestrIzdanii(long idreestrIzdanii) {
        this.idreestrIzdanii = idreestrIzdanii;
    }

    @Basic
    @Column(name = "id_dogovora", nullable = true, insertable = true, updatable = true)
    public Long getIdDogovora() {
        return idDogovora;
    }

    public void setIdDogovora(Long idDogovora) {
        this.idDogovora = idDogovora;
    }

    @Basic
    @Column(name = "id_kontr_agent", nullable = true, insertable = true, updatable = true)
    public Long getIdKontrAgent() {
        return idKontrAgent;
    }

    public void setIdKontrAgent(Long idKontrAgent) {
        this.idKontrAgent = idKontrAgent;
    }

    @Basic
    @Column(name = "name_izd", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNameIzd() {
        return nameIzd;
    }

    public void setNameIzd(String nameIzd) {
        this.nameIzd = nameIzd;
    }

    @Basic
    @Column(name = "periodichnost", nullable = true, insertable = true, updatable = true, length = 255)
    public String getPeriodichnost() {
        return periodichnost;
    }

    public void setPeriodichnost(String periodichnost) {
        this.periodichnost = periodichnost;
    }

    @Basic
    @Column(name = "ca", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    @Basic
    @Column(name = "tema", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Basic
    @Column(name = "auditoria", nullable = true, insertable = true, updatable = true, length = 255)
    public String getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(String auditoria) {
        this.auditoria = auditoria;
    }

    @Basic
    @Column(name = "construction", nullable = true, insertable = true, updatable = true, length = 255)
    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    @Basic
    @Column(name = "comment_izdanii", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCommentIzdanii() {
        return commentIzdanii;
    }

    public void setCommentIzdanii(String commentIzdanii) {
        this.commentIzdanii = commentIzdanii;
    }

    @Basic
    @Column(name = "clientname", nullable = true, insertable = true, updatable = true, length = 255)
    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReestrIzdanii that = (ReestrIzdanii) o;

        if (idreestrIzdanii != that.idreestrIzdanii) return false;
        if (auditoria != null ? !auditoria.equals(that.auditoria) : that.auditoria != null) return false;
        if (ca != null ? !ca.equals(that.ca) : that.ca != null) return false;
        if (clientname != null ? !clientname.equals(that.clientname) : that.clientname != null) return false;
        if (commentIzdanii != null ? !commentIzdanii.equals(that.commentIzdanii) : that.commentIzdanii != null)
            return false;
        if (construction != null ? !construction.equals(that.construction) : that.construction != null) return false;
        if (idDogovora != null ? !idDogovora.equals(that.idDogovora) : that.idDogovora != null) return false;
        if (idKontrAgent != null ? !idKontrAgent.equals(that.idKontrAgent) : that.idKontrAgent != null) return false;
        if (nameIzd != null ? !nameIzd.equals(that.nameIzd) : that.nameIzd != null) return false;
        if (periodichnost != null ? !periodichnost.equals(that.periodichnost) : that.periodichnost != null)
            return false;
        if (tema != null ? !tema.equals(that.tema) : that.tema != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idreestrIzdanii ^ (idreestrIzdanii >>> 32));
        result = 31 * result + (idDogovora != null ? idDogovora.hashCode() : 0);
        result = 31 * result + (idKontrAgent != null ? idKontrAgent.hashCode() : 0);
        result = 31 * result + (nameIzd != null ? nameIzd.hashCode() : 0);
        result = 31 * result + (periodichnost != null ? periodichnost.hashCode() : 0);
        result = 31 * result + (ca != null ? ca.hashCode() : 0);
        result = 31 * result + (tema != null ? tema.hashCode() : 0);
        result = 31 * result + (auditoria != null ? auditoria.hashCode() : 0);
        result = 31 * result + (construction != null ? construction.hashCode() : 0);
        result = 31 * result + (commentIzdanii != null ? commentIzdanii.hashCode() : 0);
        result = 31 * result + (clientname != null ? clientname.hashCode() : 0);
        return result;
    }
}
