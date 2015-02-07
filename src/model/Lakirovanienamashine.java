package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by DMalenkov on 26.11.2014.
 */
@Entity
public class Lakirovanienamashine implements Serializable {
    private long idlakirovanieLico;
    private Long idZayavok;
    private Long idComponenti;
    private String licoORoborotLak;
    private String vladelecLaka;
    private String tipLakirovaniya;
    private String tipLaka;
    private String vidLaka;
    private String priznakLaka;
    private String postavchikLaka;
    private Date dataPostavki;
    private String lakirovanieNaMashinecol;

    @Id
    @Column(name = "idlakirovanieLico", nullable = false, insertable = true, updatable = true)
    public long getIdlakirovanieLico() {
        return idlakirovanieLico;
    }

    public void setIdlakirovanieLico(long idlakirovanieLico) {
        this.idlakirovanieLico = idlakirovanieLico;
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
    @Column(name = "licoORoborotLak", nullable = true, insertable = true, updatable = true, length = 45)
    public String getLicoORoborotLak() {
        return licoORoborotLak;
    }

    public void setLicoORoborotLak(String licoORoborotLak) {
        this.licoORoborotLak = licoORoborotLak;
    }

    @Basic
    @Column(name = "vladelecLaka", nullable = true, insertable = true, updatable = true, length = 255)
    public String getVladelecLaka() {
        return vladelecLaka;
    }

    public void setVladelecLaka(String vladelecLaka) {
        this.vladelecLaka = vladelecLaka;
    }

    @Basic
    @Column(name = "tipLakirovaniya", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTipLakirovaniya() {
        return tipLakirovaniya;
    }

    public void setTipLakirovaniya(String tipLakirovaniya) {
        this.tipLakirovaniya = tipLakirovaniya;
    }

    @Basic
    @Column(name = "tipLaka", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTipLaka() {
        return tipLaka;
    }

    public void setTipLaka(String tipLaka) {
        this.tipLaka = tipLaka;
    }

    @Basic
    @Column(name = "vidLaka", nullable = true, insertable = true, updatable = true, length = 255)
    public String getVidLaka() {
        return vidLaka;
    }

    public void setVidLaka(String vidLaka) {
        this.vidLaka = vidLaka;
    }

    @Basic
    @Column(name = "priznakLaka", nullable = true, insertable = true, updatable = true, length = 255)
    public String getPriznakLaka() {
        return priznakLaka;
    }

    public void setPriznakLaka(String priznakLaka) {
        this.priznakLaka = priznakLaka;
    }

    @Basic
    @Column(name = "postavchikLaka", nullable = true, insertable = true, updatable = true, length = 255)
    public String getPostavchikLaka() {
        return postavchikLaka;
    }

    public void setPostavchikLaka(String postavchikLaka) {
        this.postavchikLaka = postavchikLaka;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataPostavki", nullable = true, insertable = true, updatable = true)
    public Date getDataPostavki() {
        return dataPostavki;
    }

    public void setDataPostavki(Date dataPostavki) {
        this.dataPostavki = dataPostavki;
    }

    @Basic
    @Column(name = "lakirovanieNaMashinecol", nullable = true, insertable = true, updatable = true, length = 45)
    public String getLakirovanieNaMashinecol() {
        return lakirovanieNaMashinecol;
    }

    public void setLakirovanieNaMashinecol(String lakirovanieNaMashinecol) {
        this.lakirovanieNaMashinecol = lakirovanieNaMashinecol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lakirovanienamashine that = (Lakirovanienamashine) o;

        if (idlakirovanieLico != that.idlakirovanieLico) return false;
        if (dataPostavki != null ? !dataPostavki.equals(that.dataPostavki) : that.dataPostavki != null) return false;
        if (idComponenti != null ? !idComponenti.equals(that.idComponenti) : that.idComponenti != null) return false;
        if (idZayavok != null ? !idZayavok.equals(that.idZayavok) : that.idZayavok != null) return false;
        if (lakirovanieNaMashinecol != null ? !lakirovanieNaMashinecol.equals(that.lakirovanieNaMashinecol) : that.lakirovanieNaMashinecol != null)
            return false;
        if (licoORoborotLak != null ? !licoORoborotLak.equals(that.licoORoborotLak) : that.licoORoborotLak != null)
            return false;
        if (postavchikLaka != null ? !postavchikLaka.equals(that.postavchikLaka) : that.postavchikLaka != null)
            return false;
        if (priznakLaka != null ? !priznakLaka.equals(that.priznakLaka) : that.priznakLaka != null) return false;
        if (tipLaka != null ? !tipLaka.equals(that.tipLaka) : that.tipLaka != null) return false;
        if (tipLakirovaniya != null ? !tipLakirovaniya.equals(that.tipLakirovaniya) : that.tipLakirovaniya != null)
            return false;
        if (vidLaka != null ? !vidLaka.equals(that.vidLaka) : that.vidLaka != null) return false;
        if (vladelecLaka != null ? !vladelecLaka.equals(that.vladelecLaka) : that.vladelecLaka != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idlakirovanieLico ^ (idlakirovanieLico >>> 32));
        result = 31 * result + (idZayavok != null ? idZayavok.hashCode() : 0);
        result = 31 * result + (idComponenti != null ? idComponenti.hashCode() : 0);
        result = 31 * result + (licoORoborotLak != null ? licoORoborotLak.hashCode() : 0);
        result = 31 * result + (vladelecLaka != null ? vladelecLaka.hashCode() : 0);
        result = 31 * result + (tipLakirovaniya != null ? tipLakirovaniya.hashCode() : 0);
        result = 31 * result + (tipLaka != null ? tipLaka.hashCode() : 0);
        result = 31 * result + (vidLaka != null ? vidLaka.hashCode() : 0);
        result = 31 * result + (priznakLaka != null ? priznakLaka.hashCode() : 0);
        result = 31 * result + (postavchikLaka != null ? postavchikLaka.hashCode() : 0);
        result = 31 * result + (dataPostavki != null ? dataPostavki.hashCode() : 0);
        result = 31 * result + (lakirovanieNaMashinecol != null ? lakirovanieNaMashinecol.hashCode() : 0);
        return result;
    }
}
