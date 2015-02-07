package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by DMalenkov on 26.11.2014.
 */
@Entity
public class Dostavkasignalov implements Serializable {
    private long iddostavkaSignalov;
    private Long idZayavok;
    private Long idoperaciiSGotovimIzdeliem;
    private Date dataSignalov;
    private String companySignali;
    private String adresSignalov;
    private String contactSignalov;

    @Id
    @Column(name = "iddostavkaSignalov", nullable = false, insertable = true, updatable = true)
    public long getIddostavkaSignalov() {
        return iddostavkaSignalov;
    }

    public void setIddostavkaSignalov(long iddostavkaSignalov) {
        this.iddostavkaSignalov = iddostavkaSignalov;
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
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataSignalov", nullable = true, insertable = true, updatable = true)
    public Date getDataSignalov() {
        return dataSignalov;
    }

    public void setDataSignalov(Date dataSignalov) {
        this.dataSignalov = dataSignalov;
    }

    @Basic
    @Column(name = "companySignali", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCompanySignali() {
        return companySignali;
    }

    public void setCompanySignali(String companySignali) {
        this.companySignali = companySignali;
    }

    @Basic
    @Column(name = "adresSignalov", nullable = true, insertable = true, updatable = true, length = 500)
    public String getAdresSignalov() {
        return adresSignalov;
    }

    public void setAdresSignalov(String adresSignalov) {
        this.adresSignalov = adresSignalov;
    }

    @Basic
    @Column(name = "contactSignalov", nullable = true, insertable = true, updatable = true, length = 500)
    public String getContactSignalov() {
        return contactSignalov;
    }

    public void setContactSignalov(String contactSignalov) {
        this.contactSignalov = contactSignalov;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dostavkasignalov that = (Dostavkasignalov) o;

        if (iddostavkaSignalov != that.iddostavkaSignalov) return false;
        if (adresSignalov != null ? !adresSignalov.equals(that.adresSignalov) : that.adresSignalov != null)
            return false;
        if (companySignali != null ? !companySignali.equals(that.companySignali) : that.companySignali != null)
            return false;
        if (contactSignalov != null ? !contactSignalov.equals(that.contactSignalov) : that.contactSignalov != null)
            return false;
        if (dataSignalov != null ? !dataSignalov.equals(that.dataSignalov) : that.dataSignalov != null) return false;
        if (idZayavok != null ? !idZayavok.equals(that.idZayavok) : that.idZayavok != null) return false;
        if (idoperaciiSGotovimIzdeliem != null ? !idoperaciiSGotovimIzdeliem.equals(that.idoperaciiSGotovimIzdeliem) : that.idoperaciiSGotovimIzdeliem != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (iddostavkaSignalov ^ (iddostavkaSignalov >>> 32));
        result = 31 * result + (idZayavok != null ? idZayavok.hashCode() : 0);
        result = 31 * result + (idoperaciiSGotovimIzdeliem != null ? idoperaciiSGotovimIzdeliem.hashCode() : 0);
        result = 31 * result + (dataSignalov != null ? dataSignalov.hashCode() : 0);
        result = 31 * result + (companySignali != null ? companySignali.hashCode() : 0);
        result = 31 * result + (adresSignalov != null ? adresSignalov.hashCode() : 0);
        result = 31 * result + (contactSignalov != null ? contactSignalov.hashCode() : 0);
        return result;
    }
}
