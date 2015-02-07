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
public class Pantonespravochnik implements Serializable {
    private long idpantoneSpravochnik;
    private String namePantona;
    private String colorPantone;

    @Id
    @Column(name = "idpantoneSpravochnik", nullable = false, insertable = true, updatable = true)
    public long getIdpantoneSpravochnik() {
        return idpantoneSpravochnik;
    }

    public void setIdpantoneSpravochnik(long idpantoneSpravochnik) {
        this.idpantoneSpravochnik = idpantoneSpravochnik;
    }

    @Basic
    @Column(name = "namePantona", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNamePantona() {
        return namePantona;
    }

    public void setNamePantona(String namePantona) {
        this.namePantona = namePantona;
    }

    @Basic
    @Column(name = "colorPantone", nullable = true, insertable = true, updatable = true, length = 255)
    public String getColorPantone() {
        return colorPantone;
    }

    public void setColorPantone(String colorPantone) {
        this.colorPantone = colorPantone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pantonespravochnik that = (Pantonespravochnik) o;

        if (idpantoneSpravochnik != that.idpantoneSpravochnik) return false;
        if (colorPantone != null ? !colorPantone.equals(that.colorPantone) : that.colorPantone != null) return false;
        if (namePantona != null ? !namePantona.equals(that.namePantona) : that.namePantona != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idpantoneSpravochnik ^ (idpantoneSpravochnik >>> 32));
        result = 31 * result + (namePantona != null ? namePantona.hashCode() : 0);
        result = 31 * result + (colorPantone != null ? colorPantone.hashCode() : 0);
        return result;
    }
}
