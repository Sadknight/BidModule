package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by DMalenkov on 26.11.2014.
 */
@Entity
public class Dogovora implements Serializable {
    private long iddogovora;
    private Long clientNumber;
    private String clientName;
    private String numberList;
    private Date regDate;
    private Date regDateEnd;
    private String autoProl;
    private String user;
    private String numberDor;
    private Date dateBegin;
    private Date dateEnd;
    private String tipDogovor;
    private String vid;
    private String predmet;
    private String giperSsilka;
    private String commentDogovora;
    private String kyrs;
    private String otvetstvenostBymaga;
    private String marja1;
    private String marja2;
    private String ysloviya;
    private String baseSpec;

    @Id
    @Column(name = "iddogovora", nullable = false, insertable = true, updatable = true)
    public long getIddogovora() {
        return iddogovora;
    }

    public void setIddogovora(long iddogovora) {
        this.iddogovora = iddogovora;
    }

    @Basic
    @Column(name = "client_number", nullable = true, insertable = true, updatable = true)
    public Long getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(Long clientNumber) {
        this.clientNumber = clientNumber;
    }

    @Basic
    @Column(name = "client_name", nullable = true, insertable = true, updatable = true, length = 255)
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Basic
    @Column(name = "number_list", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNumberList() {
        return numberList;
    }

    public void setNumberList(String numberList) {
        this.numberList = numberList;
    }

    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "reg_date", nullable = true, insertable = true, updatable = true)
    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "reg_date_end", nullable = true, insertable = true, updatable = true)
    public Date getRegDateEnd() {
        return regDateEnd;
    }

    public void setRegDateEnd(Date regDateEnd) {
        this.regDateEnd = regDateEnd;
    }

    @Basic
    @Column(name = "auto_prol", nullable = true, insertable = true, updatable = true, length = 15)
    public String getAutoProl() {
        return autoProl;
    }

    public void setAutoProl(String autoProl) {
        this.autoProl = autoProl;
    }

    @Basic
    @Column(name = "user", nullable = true, insertable = true, updatable = true, length = 255)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "number_dor", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNumberDor() {
        return numberDor;
    }

    public void setNumberDor(String numberDor) {
        this.numberDor = numberDor;
    }

    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "date_begin", nullable = true, insertable = true, updatable = true)
    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "date_end", nullable = true, insertable = true, updatable = true)
    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Basic
    @Column(name = "tip_dogovor", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTipDogovor() {
        return tipDogovor;
    }

    public void setTipDogovor(String tipDogovor) {
        this.tipDogovor = tipDogovor;
    }

    @Basic
    @Column(name = "vid", nullable = true, insertable = true, updatable = true, length = 255)
    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    @Basic
    @Column(name = "predmet", nullable = true, insertable = true, updatable = true, length = 255)
    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    @Basic
    @Column(name = "giper_ssilka", nullable = true, insertable = true, updatable = true, length = 500)
    public String getGiperSsilka() {
        return giperSsilka;
    }

    public void setGiperSsilka(String giperSsilka) {
        this.giperSsilka = giperSsilka;
    }

    @Basic
    @Column(name = "comment_dogovora", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCommentDogovora() {
        return commentDogovora;
    }

    public void setCommentDogovora(String commentDogovora) {
        this.commentDogovora = commentDogovora;
    }


    @Basic
    @Column(name = "kyrs", nullable = true, insertable = true, updatable = true, length = 50)
    public String getKyrs() {
        return kyrs;
    }

    public void setKyrs(String kyrs) {
        this.kyrs = kyrs;
    }


    @Basic
    @Column(name = "ysloviya", nullable = true, insertable = true, updatable = true, length = 500)
    public String getYsloviya() {
        return ysloviya;
    }

    public void setYsloviya(String ysloviya) {
        this.ysloviya = ysloviya;
    }


    @Basic
    @Column(name = "marja1", nullable = true, insertable = true, updatable = true, length = 500)

    public String getMarja1() {
        return marja1;
    }

    public void setMarja1(String marja1) {
        this.marja1 = marja1;
    }


    @Basic
    @Column(name = "marja2", nullable = true, insertable = true, updatable = true, length = 500)
    public String getMarja2() {
        return marja2;
    }

    public void setMarja2(String marja2) {
        this.marja2 = marja2;
    }


    @Basic
    @Column(name = "baseSpec", nullable = true, insertable = true, updatable = true, length = 45)
    public String getBaseSpec() {
        return baseSpec;
    }

    public void setBaseSpec(String baseSpec) {
        this.baseSpec = baseSpec;
    }

    @Basic
    @Column(name = "otvetstvenostBymaga", nullable = true, insertable = true, updatable = true, length = 500)
    public String getOtvetstvenostBymaga() {
        return otvetstvenostBymaga;
    }

    public void setOtvetstvenostBymaga(String otvetstvenostBymaga) {
        this.otvetstvenostBymaga = otvetstvenostBymaga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dogovora dogovora = (Dogovora) o;

        if (iddogovora != dogovora.iddogovora) return false;
        if (autoProl != null ? !autoProl.equals(dogovora.autoProl) : dogovora.autoProl != null) return false;
        if (!clientName.equals(dogovora.clientName)) return false;
        if (!clientNumber.equals(dogovora.clientNumber)) return false;
        if (commentDogovora != null ? !commentDogovora.equals(dogovora.commentDogovora) : dogovora.commentDogovora != null)
            return false;
        if (dateBegin != null ? !dateBegin.equals(dogovora.dateBegin) : dogovora.dateBegin != null) return false;
        if (dateEnd != null ? !dateEnd.equals(dogovora.dateEnd) : dogovora.dateEnd != null) return false;
        if (giperSsilka != null ? !giperSsilka.equals(dogovora.giperSsilka) : dogovora.giperSsilka != null)
            return false;
        if (kyrs != null ? !kyrs.equals(dogovora.kyrs) : dogovora.kyrs != null) return false;
        if (marja1 != null ? !marja1.equals(dogovora.marja1) : dogovora.marja1 != null) return false;
        if (marja2 != null ? !marja2.equals(dogovora.marja2) : dogovora.marja2 != null) return false;
        if (numberDor != null ? !numberDor.equals(dogovora.numberDor) : dogovora.numberDor != null) return false;
        if (numberList != null ? !numberList.equals(dogovora.numberList) : dogovora.numberList != null) return false;
        if (otvetstvenostBymaga != null ? !otvetstvenostBymaga.equals(dogovora.otvetstvenostBymaga) : dogovora.otvetstvenostBymaga != null)
            return false;
        if (predmet != null ? !predmet.equals(dogovora.predmet) : dogovora.predmet != null) return false;
        if (regDate != null ? !regDate.equals(dogovora.regDate) : dogovora.regDate != null) return false;
        if (regDateEnd != null ? !regDateEnd.equals(dogovora.regDateEnd) : dogovora.regDateEnd != null) return false;
        if (tipDogovor != null ? !tipDogovor.equals(dogovora.tipDogovor) : dogovora.tipDogovor != null) return false;
        if (user != null ? !user.equals(dogovora.user) : dogovora.user != null) return false;
        if (vid != null ? !vid.equals(dogovora.vid) : dogovora.vid != null) return false;
        if (ysloviya != null ? !ysloviya.equals(dogovora.ysloviya) : dogovora.ysloviya != null) return false;
        if (baseSpec != null ? !baseSpec.equals(dogovora.baseSpec) : dogovora.baseSpec != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (iddogovora ^ (iddogovora >>> 32));
        result = 31 * result + clientNumber.hashCode();
        result = 31 * result + clientName.hashCode();
        result = 31 * result + (baseSpec != null ? baseSpec.hashCode() : 0);
        result = 31 * result + (numberList != null ? numberList.hashCode() : 0);
        result = 31 * result + (regDate != null ? regDate.hashCode() : 0);
        result = 31 * result + (regDateEnd != null ? regDateEnd.hashCode() : 0);
        result = 31 * result + (autoProl != null ? autoProl.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (numberDor != null ? numberDor.hashCode() : 0);
        result = 31 * result + (dateBegin != null ? dateBegin.hashCode() : 0);
        result = 31 * result + (dateEnd != null ? dateEnd.hashCode() : 0);
        result = 31 * result + (tipDogovor != null ? tipDogovor.hashCode() : 0);
        result = 31 * result + (vid != null ? vid.hashCode() : 0);
        result = 31 * result + (predmet != null ? predmet.hashCode() : 0);
        result = 31 * result + (giperSsilka != null ? giperSsilka.hashCode() : 0);
        result = 31 * result + (commentDogovora != null ? commentDogovora.hashCode() : 0);
        result = 31 * result + (kyrs != null ? kyrs.hashCode() : 0);
        result = 31 * result + (otvetstvenostBymaga != null ? otvetstvenostBymaga.hashCode() : 0);
        result = 31 * result + (marja1 != null ? marja1.hashCode() : 0);
        result = 31 * result + (marja2 != null ? marja2.hashCode() : 0);
        result = 31 * result + (ysloviya != null ? ysloviya.hashCode() : 0);
        return result;
    }
}
