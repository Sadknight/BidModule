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
public class Bymaga implements Serializable {
    private long idbymaga;
    private Long idZayavok;
    private Long idComponenti;

    @Id
    @Column(name = "idbymaga", nullable = false, insertable = true, updatable = true)
    public long getIdbymaga() {
        return idbymaga;
    }

    public void setIdbymaga(long idbymaga) {
        this.idbymaga = idbymaga;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bymaga bymaga = (Bymaga) o;

        if (idbymaga != bymaga.idbymaga) return false;
        if (idComponenti != null ? !idComponenti.equals(bymaga.idComponenti) : bymaga.idComponenti != null)
            return false;
        if (idZayavok != null ? !idZayavok.equals(bymaga.idZayavok) : bymaga.idZayavok != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idbymaga ^ (idbymaga >>> 32));
        result = 31 * result + (idZayavok != null ? idZayavok.hashCode() : 0);
        result = 31 * result + (idComponenti != null ? idComponenti.hashCode() : 0);
        return result;
    }
}
