package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by DMalenkov on 26.11.2014.
 */
@Entity
public class Dostavka implements Serializable {
    private long iddostavka;
    private Long idZayavok;
    private Long idykladkaNaPaleti;
    private Double tirajDostavki;
    private Date dataOtgryzkiDostavki;
    private String companiyaDostavki;
    private String adresDostavki;
    private String kontaktDostavki;

    @Id
    @Column(name = "iddostavka", nullable = false, insertable = true, updatable = true)
    public long getIddostavka() {
        return iddostavka;
    }

    public void setIddostavka(long iddostavka) {
        this.iddostavka = iddostavka;
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
    @Column(name = "idykladkaNaPaleti", nullable = true, insertable = true, updatable = true)
    public Long getIdykladkaNaPaleti() {
        return idykladkaNaPaleti;
    }

    public void setIdykladkaNaPaleti(Long idykladkaNaPaleti) {
        this.idykladkaNaPaleti = idykladkaNaPaleti;
    }

    @Basic
    @Column(name = "tirajDostavki", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getTirajDostavki() {
        return tirajDostavki;
    }

    public void setTirajDostavki(Double tirajDostavki) {
        this.tirajDostavki = tirajDostavki;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataOtgryzkiDostavki", nullable = true, insertable = true, updatable = true)
    public Date getDataOtgryzkiDostavki() {
        return dataOtgryzkiDostavki;
    }

    public void setDataOtgryzkiDostavki(Date dataOtgryzkiDostavki) {
        this.dataOtgryzkiDostavki = dataOtgryzkiDostavki;
    }

    @Basic
    @Column(name = "companiyaDostavki", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCompaniyaDostavki() {
        return companiyaDostavki;
    }

    public void setCompaniyaDostavki(String companiyaDostavki) {
        this.companiyaDostavki = companiyaDostavki;
    }

    @Basic
    @Column(name = "adresDostavki", nullable = true, insertable = true, updatable = true, length = 500)
    public String getAdresDostavki() {
        return adresDostavki;
    }

    public void setAdresDostavki(String adresDostavki) {
        this.adresDostavki = adresDostavki;
    }

    @Basic
    @Column(name = "kontaktDostavki", nullable = true, insertable = true, updatable = true, length = 500)
    public String getKontaktDostavki() {
        return kontaktDostavki;
    }

    public void setKontaktDostavki(String kontaktDostavki) {
        this.kontaktDostavki = kontaktDostavki;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dostavka dostavka = (Dostavka) o;

        if (iddostavka != dostavka.iddostavka) return false;
        if (adresDostavki != null ? !adresDostavki.equals(dostavka.adresDostavki) : dostavka.adresDostavki != null)
            return false;
        if (companiyaDostavki != null ? !companiyaDostavki.equals(dostavka.companiyaDostavki) : dostavka.companiyaDostavki != null)
            return false;
        if (dataOtgryzkiDostavki != null ? !dataOtgryzkiDostavki.equals(dostavka.dataOtgryzkiDostavki) : dostavka.dataOtgryzkiDostavki != null)
            return false;
        if (idZayavok != null ? !idZayavok.equals(dostavka.idZayavok) : dostavka.idZayavok != null) return false;
        if (idykladkaNaPaleti != null ? !idykladkaNaPaleti.equals(dostavka.idykladkaNaPaleti) : dostavka.idykladkaNaPaleti != null)
            return false;
        if (kontaktDostavki != null ? !kontaktDostavki.equals(dostavka.kontaktDostavki) : dostavka.kontaktDostavki != null)
            return false;
        if (tirajDostavki != null ? !tirajDostavki.equals(dostavka.tirajDostavki) : dostavka.tirajDostavki != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (iddostavka ^ (iddostavka >>> 32));
        result = 31 * result + (idZayavok != null ? idZayavok.hashCode() : 0);
        result = 31 * result + (idykladkaNaPaleti != null ? idykladkaNaPaleti.hashCode() : 0);
        result = 31 * result + (tirajDostavki != null ? tirajDostavki.hashCode() : 0);
        result = 31 * result + (dataOtgryzkiDostavki != null ? dataOtgryzkiDostavki.hashCode() : 0);
        result = 31 * result + (companiyaDostavki != null ? companiyaDostavki.hashCode() : 0);
        result = 31 * result + (adresDostavki != null ? adresDostavki.hashCode() : 0);
        result = 31 * result + (kontaktDostavki != null ? kontaktDostavki.hashCode() : 0);
        return result;
    }
}
