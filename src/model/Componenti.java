package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by DMalenkov on 26.11.2014.
 */
@Entity
public class Componenti implements Serializable {
    private long idComponenti;
    private Long idZayavki;
    private String tipComponenti;
    private String nazvanieComponenti;
    private Boolean davalcheskoe;
    private Date dataPolycheniy;
    private Integer colPolos;
    private Integer tirajComponenti;
    private String format1Componenti;
    private String format2Componenti;
    private Integer kraskiComponentiLico;
    private Integer kraskiComponentiOborot;
    private String kraskiComponentiLicoN;
    private String kraskiComponentiOborotN;
    private Integer colPantoniLico;
    private Integer colPantoniOborot;
    private Integer colLakLico;
    private Integer colLakOborot;
    private Boolean otdelkaComponenti;
    private String recomOborydovanie;
    private String oborot;
    private Integer colPervixPriladok;
    private Integer colForm;
    private String sposobSkrepleniya;
    private Boolean cvetoproba;
    private String cvetoprobaComponentiVadelec;
    private Integer colCvetoprob;
    private String formatCvetoprob;
    private String polosiCvetoprob;
    private Date dataPrixodaCvetoprobi;
    private Boolean obrazeccveta;
    private String vladelecObrazcaCveta;
    private String polosiObrzcaCveta;
    private Boolean zakazchikNaPechat;
    private Boolean stiki;
    private String polosiStikov;
    private Boolean maketComponenti;
    private Integer colSpyskov;
    private String format3Componenti;
    private String format4Componenti;
    private Integer koreshok;
    private String format5Componenti;
    private String format6Componenti;
    private String mestoPolojenie;
    private String mestoRaspolojenie;
    private Integer colCapel;
    private Integer polosaRaspolojeniya1;
    private Integer polosaRaspolojeniya2;
    private Boolean mejdy;
    private Boolean opredelennoeMesto;
    private String tipKraski;

    @Id
    @javax.persistence.Column(name = "idComponenti", nullable = false, insertable = true, updatable = true)
    public long getIdComponenti() {
        return idComponenti;
    }

    public void setIdComponenti(long idComponenti) {
        this.idComponenti = idComponenti;
    }

    @Basic
    @javax.persistence.Column(name = "idZayavki", nullable = true, insertable = true, updatable = true)
    public Long getIdZayavki() {
        return idZayavki;
    }

    public void setIdZayavki(Long idZayavki) {
        this.idZayavki = idZayavki;
    }

    @Basic
    @javax.persistence.Column(name = "tipComponenti", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTipComponenti() {
        return tipComponenti;
    }

    public void setTipComponenti(String tipComponenti) {
        this.tipComponenti = tipComponenti;
    }

    @Basic
    @javax.persistence.Column(name = "nazvanieComponenti", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNazvanieComponenti() {
        return nazvanieComponenti;
    }

    public void setNazvanieComponenti(String nazvanieComponenti) {
        this.nazvanieComponenti = nazvanieComponenti;
    }

    @Basic
    @javax.persistence.Column(name = "davalcheskoe", nullable = true, insertable = true, updatable = true)
    public Boolean getDavalcheskoe() {
        return davalcheskoe;
    }

    public void setDavalcheskoe(Boolean davalcheskoe) {
        this.davalcheskoe = davalcheskoe;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @javax.persistence.Column(name = "dataPolycheniy", nullable = true, insertable = true, updatable = true)
    public Date getDataPolycheniy() {
        return dataPolycheniy;
    }

    public void setDataPolycheniy(Date dataPolycheniy) {
        this.dataPolycheniy = dataPolycheniy;
    }

    @Basic
    @javax.persistence.Column(name = "colPolos", nullable = true, insertable = true, updatable = true)
    public Integer getColPolos() {
        return colPolos;
    }

    public void setColPolos(Integer colPolos) {
        this.colPolos = colPolos;
    }

    @Basic
    @javax.persistence.Column(name = "tirajComponenti", nullable = true, insertable = true, updatable = true)
    public Integer getTirajComponenti() {
        return tirajComponenti;
    }

    public void setTirajComponenti(Integer tirajComponenti) {
        this.tirajComponenti = tirajComponenti;
    }

    @Basic
    @javax.persistence.Column(name = "format1Componenti", nullable = true, insertable = true, updatable = true, length = 255)
    public String getFormat1Componenti() {
        return format1Componenti;
    }

    public void setFormat1Componenti(String format1Componenti) {
        this.format1Componenti = format1Componenti;
    }

    @Basic
    @javax.persistence.Column(name = "format2Componenti", nullable = true, insertable = true, updatable = true, length = 255)
    public String getFormat2Componenti() {
        return format2Componenti;
    }

    public void setFormat2Componenti(String format2Componenti) {
        this.format2Componenti = format2Componenti;
    }

    @Basic
    @javax.persistence.Column(name = "kraskiComponentiLico", nullable = true, insertable = true, updatable = true)
    public Integer getKraskiComponentiLico() {
        return kraskiComponentiLico;
    }

    public void setKraskiComponentiLico(Integer kraskiComponentiLico) {
        this.kraskiComponentiLico = kraskiComponentiLico;
    }

    @Basic
    @javax.persistence.Column(name = "kraskiComponentiOborot", nullable = true, insertable = true, updatable = true)
    public Integer getKraskiComponentiOborot() {
        return kraskiComponentiOborot;
    }

    public void setKraskiComponentiOborot(Integer kraskiComponentiOborot) {
        this.kraskiComponentiOborot = kraskiComponentiOborot;
    }

    @Basic
    @javax.persistence.Column(name = "kraskiComponentiLicoN", nullable = true, insertable = true, updatable = true, length = 255)
    public String getKraskiComponentiLicoN() {
        return kraskiComponentiLicoN;
    }

    public void setKraskiComponentiLicoN(String kraskiComponentiLicoN) {
        this.kraskiComponentiLicoN = kraskiComponentiLicoN;
    }

    @Basic
    @javax.persistence.Column(name = "kraskiComponentiOborotN", nullable = true, insertable = true, updatable = true, length = 255)
    public String getKraskiComponentiOborotN() {
        return kraskiComponentiOborotN;
    }

    public void setKraskiComponentiOborotN(String kraskiComponentiOborotN) {
        this.kraskiComponentiOborotN = kraskiComponentiOborotN;
    }

    @Basic
    @javax.persistence.Column(name = "colPantoniLico", nullable = true, insertable = true, updatable = true)
    public Integer getColPantoniLico() {
        return colPantoniLico;
    }

    public void setColPantoniLico(Integer colPantoniLico) {
        this.colPantoniLico = colPantoniLico;
    }

    @Basic
    @javax.persistence.Column(name = "colPantoniOborot", nullable = true, insertable = true, updatable = true)
    public Integer getColPantoniOborot() {
        return colPantoniOborot;
    }

    public void setColPantoniOborot(Integer colPantoniOborot) {
        this.colPantoniOborot = colPantoniOborot;
    }

    @Basic
    @javax.persistence.Column(name = "colLakLico", nullable = true, insertable = true, updatable = true)
    public Integer getColLakLico() {
        return colLakLico;
    }

    public void setColLakLico(Integer colLakLico) {
        this.colLakLico = colLakLico;
    }

    @Basic
    @javax.persistence.Column(name = "colLakOborot", nullable = true, insertable = true, updatable = true)
    public Integer getColLakOborot() {
        return colLakOborot;
    }

    public void setColLakOborot(Integer colLakOborot) {
        this.colLakOborot = colLakOborot;
    }

    @Basic
    @javax.persistence.Column(name = "otdelkaComponenti", nullable = true, insertable = true, updatable = true)
    public Boolean getOtdelkaComponenti() {
        return otdelkaComponenti;
    }

    public void setOtdelkaComponenti(Boolean otdelkaComponenti) {
        this.otdelkaComponenti = otdelkaComponenti;
    }

    @Basic
    @javax.persistence.Column(name = "recomOborydovanie", nullable = true, insertable = true, updatable = true, length = 255)
    public String getRecomOborydovanie() {
        return recomOborydovanie;
    }

    public void setRecomOborydovanie(String recomOborydovanie) {
        this.recomOborydovanie = recomOborydovanie;
    }

    @Basic
    @javax.persistence.Column(name = "oborot", nullable = true, insertable = true, updatable = true, length = 45)
    public String getOborot() {
        return oborot;
    }

    public void setOborot(String oborot) {
        this.oborot = oborot;
    }

    @Basic
    @javax.persistence.Column(name = "colPervixPriladok", nullable = true, insertable = true, updatable = true)
    public Integer getColPervixPriladok() {
        return colPervixPriladok;
    }

    public void setColPervixPriladok(Integer colPervixPriladok) {
        this.colPervixPriladok = colPervixPriladok;
    }

    @Basic
    @javax.persistence.Column(name = "colForm", nullable = true, insertable = true, updatable = true)
    public Integer getColForm() {
        return colForm;
    }

    public void setColForm(Integer colForm) {
        this.colForm = colForm;
    }

    @Basic
    @javax.persistence.Column(name = "sposobSkrepleniya", nullable = true, insertable = true, updatable = true, length = 255)
    public String getSposobSkrepleniya() {
        return sposobSkrepleniya;
    }

    public void setSposobSkrepleniya(String sposobSkrepleniya) {
        this.sposobSkrepleniya = sposobSkrepleniya;
    }

    @Basic
    @javax.persistence.Column(name = "cvetoproba", nullable = true, insertable = true, updatable = true)
    public Boolean getCvetoproba() {
        return cvetoproba;
    }

    public void setCvetoproba(Boolean cvetoproba) {
        this.cvetoproba = cvetoproba;
    }

    @Basic
    @javax.persistence.Column(name = "cvetoprobaComponentiVadelec", nullable = true, insertable = true, updatable = true, length = 45)
    public String getCvetoprobaComponentiVadelec() {
        return cvetoprobaComponentiVadelec;
    }

    public void setCvetoprobaComponentiVadelec(String cvetoprobaComponentiVadelec) {
        this.cvetoprobaComponentiVadelec = cvetoprobaComponentiVadelec;
    }

    @Basic
    @javax.persistence.Column(name = "colCvetoprob", nullable = true, insertable = true, updatable = true)
    public Integer getColCvetoprob() {
        return colCvetoprob;
    }

    public void setColCvetoprob(Integer colCvetoprob) {
        this.colCvetoprob = colCvetoprob;
    }

    @Basic
    @javax.persistence.Column(name = "formatCvetoprob", nullable = true, insertable = true, updatable = true, length = 255)
    public String getFormatCvetoprob() {
        return formatCvetoprob;
    }

    public void setFormatCvetoprob(String formatCvetoprob) {
        this.formatCvetoprob = formatCvetoprob;
    }

    @Basic
    @javax.persistence.Column(name = "polosiCvetoprob", nullable = true, insertable = true, updatable = true, length = 255)
    public String getPolosiCvetoprob() {
        return polosiCvetoprob;
    }

    public void setPolosiCvetoprob(String polosiCvetoprob) {
        this.polosiCvetoprob = polosiCvetoprob;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @javax.persistence.Column(name = "dataPrixodaCvetoprobi", nullable = true, insertable = true, updatable = true)
    public Date getDataPrixodaCvetoprobi() {
        return dataPrixodaCvetoprobi;
    }

    public void setDataPrixodaCvetoprobi(Date dataPrixodaCvetoprobi) {
        this.dataPrixodaCvetoprobi = dataPrixodaCvetoprobi;
    }

    @Basic
    @javax.persistence.Column(name = "obrazeccveta", nullable = true, insertable = true, updatable = true)
    public Boolean getObrazeccveta() {
        return obrazeccveta;
    }

    public void setObrazeccveta(Boolean obrazeccveta) {
        this.obrazeccveta = obrazeccveta;
    }

    @Basic
    @javax.persistence.Column(name = "vladelecObrazcaCveta", nullable = true, insertable = true, updatable = true, length = 45)
    public String getVladelecObrazcaCveta() {
        return vladelecObrazcaCveta;
    }

    public void setVladelecObrazcaCveta(String vladelecObrazcaCveta) {
        this.vladelecObrazcaCveta = vladelecObrazcaCveta;
    }

    @Basic
    @javax.persistence.Column(name = "polosiObrzcaCveta", nullable = true, insertable = true, updatable = true, length = 255)
    public String getPolosiObrzcaCveta() {
        return polosiObrzcaCveta;
    }

    public void setPolosiObrzcaCveta(String polosiObrzcaCveta) {
        this.polosiObrzcaCveta = polosiObrzcaCveta;
    }

    @Basic
    @javax.persistence.Column(name = "zakazchikNaPechat", nullable = true, insertable = true, updatable = true)
    public Boolean getZakazchikNaPechat() {
        return zakazchikNaPechat;
    }

    public void setZakazchikNaPechat(Boolean zakazchikNaPechat) {
        this.zakazchikNaPechat = zakazchikNaPechat;
    }

    @Basic
    @javax.persistence.Column(name = "stiki", nullable = true, insertable = true, updatable = true)
    public Boolean getStiki() {
        return stiki;
    }

    public void setStiki(Boolean stiki) {
        this.stiki = stiki;
    }

    @Basic
    @javax.persistence.Column(name = "polosiStikov", nullable = true, insertable = true, updatable = true, length = 255)
    public String getPolosiStikov() {
        return polosiStikov;
    }

    public void setPolosiStikov(String polosiStikov) {
        this.polosiStikov = polosiStikov;
    }

    @Basic
    @javax.persistence.Column(name = "maketComponenti", nullable = true, insertable = true, updatable = true)
    public Boolean getMaketComponenti() {
        return maketComponenti;
    }

    public void setMaketComponenti(Boolean maketComponenti) {
        this.maketComponenti = maketComponenti;
    }

    @Basic
    @javax.persistence.Column(name = "colSpyskov", nullable = true, insertable = true, updatable = true)
    public Integer getColSpyskov() {
        return colSpyskov;
    }

    public void setColSpyskov(Integer colSpyskov) {
        this.colSpyskov = colSpyskov;
    }

    @Basic
    @javax.persistence.Column(name = "format3Componenti", nullable = true, insertable = true, updatable = true, length = 255)
    public String getFormat3Componenti() {
        return format3Componenti;
    }

    public void setFormat3Componenti(String format3Componenti) {
        this.format3Componenti = format3Componenti;
    }

    @Basic
    @javax.persistence.Column(name = "format4Componenti", nullable = true, insertable = true, updatable = true, length = 255)
    public String getFormat4Componenti() {
        return format4Componenti;
    }

    public void setFormat4Componenti(String format4Componenti) {
        this.format4Componenti = format4Componenti;
    }

    @Basic
    @javax.persistence.Column(name = "koreshok", nullable = true, insertable = true, updatable = true)
    public Integer getKoreshok() {
        return koreshok;
    }

    public void setKoreshok(Integer koreshok) {
        this.koreshok = koreshok;
    }

    @Basic
    @javax.persistence.Column(name = "format5Componenti", nullable = true, insertable = true, updatable = true, length = 255)
    public String getFormat5Componenti() {
        return format5Componenti;
    }

    public void setFormat5Componenti(String format5Componenti) {
        this.format5Componenti = format5Componenti;
    }

    @Basic
    @javax.persistence.Column(name = "format6Componenti", nullable = true, insertable = true, updatable = true, length = 255)
    public String getFormat6Componenti() {
        return format6Componenti;
    }

    public void setFormat6Componenti(String format6Componenti) {
        this.format6Componenti = format6Componenti;
    }

    @Basic
    @javax.persistence.Column(name = "mestoPolojenie", nullable = true, insertable = true, updatable = true, length = 255)
    public String getMestoPolojenie() {
        return mestoPolojenie;
    }

    public void setMestoPolojenie(String mestoPolojenie) {
        this.mestoPolojenie = mestoPolojenie;
    }

    @Basic
    @javax.persistence.Column(name = "MestoRaspolojenie", nullable = true, insertable = true, updatable = true, length = 255)
    public String getMestoRaspolojenie() {
        return mestoRaspolojenie;
    }

    public void setMestoRaspolojenie(String mestoRaspolojenie) {
        this.mestoRaspolojenie = mestoRaspolojenie;
    }

    @Basic
    @javax.persistence.Column(name = "colCapel", nullable = true, insertable = true, updatable = true)
    public Integer getColCapel() {
        return colCapel;
    }

    public void setColCapel(Integer colCapel) {
        this.colCapel = colCapel;
    }

    @Basic
    @javax.persistence.Column(name = "polosaRaspolojeniya1", nullable = true, insertable = true, updatable = true)
    public Integer getPolosaRaspolojeniya1() {
        return polosaRaspolojeniya1;
    }

    public void setPolosaRaspolojeniya1(Integer polosaRaspolojeniya1) {
        this.polosaRaspolojeniya1 = polosaRaspolojeniya1;
    }

    @Basic
    @javax.persistence.Column(name = "polosaRaspolojeniya2", nullable = true, insertable = true, updatable = true)
    public Integer getPolosaRaspolojeniya2() {
        return polosaRaspolojeniya2;
    }

    public void setPolosaRaspolojeniya2(Integer polosaRaspolojeniya2) {
        this.polosaRaspolojeniya2 = polosaRaspolojeniya2;
    }

    @Basic
    @javax.persistence.Column(name = "mejdy", nullable = true, insertable = true, updatable = true)
    public Boolean getMejdy() {
        return mejdy;
    }

    public void setMejdy(Boolean mejdy) {
        this.mejdy = mejdy;
    }

    @Basic
    @javax.persistence.Column(name = "opredelennoeMesto", nullable = true, insertable = true, updatable = true)
    public Boolean getOpredelennoeMesto() {
        return opredelennoeMesto;
    }

    public void setOpredelennoeMesto(Boolean opredelennoeMesto) {
        this.opredelennoeMesto = opredelennoeMesto;
    }

    @Basic
    @javax.persistence.Column(name = "tipKraski", nullable = true, insertable = true, updatable = true, length = 15)
    public String getTipKraski() {
        return tipKraski;
    }

    public void setTipKraski(String tipKraski) {
        this.tipKraski = tipKraski;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Componenti that = (Componenti) o;

        if (idComponenti != that.idComponenti) return false;
        if (tipKraski != null ? !tipKraski.equals(that.tipKraski) : that.tipKraski != null) return false;
        if (colCapel != null ? !colCapel.equals(that.colCapel) : that.colCapel != null) return false;
        if (colCvetoprob != null ? !colCvetoprob.equals(that.colCvetoprob) : that.colCvetoprob != null) return false;
        if (colForm != null ? !colForm.equals(that.colForm) : that.colForm != null) return false;
        if (colLakLico != null ? !colLakLico.equals(that.colLakLico) : that.colLakLico != null) return false;
        if (colLakOborot != null ? !colLakOborot.equals(that.colLakOborot) : that.colLakOborot != null) return false;
        if (colPantoniLico != null ? !colPantoniLico.equals(that.colPantoniLico) : that.colPantoniLico != null)
            return false;
        if (colPantoniOborot != null ? !colPantoniOborot.equals(that.colPantoniOborot) : that.colPantoniOborot != null)
            return false;
        if (colPervixPriladok != null ? !colPervixPriladok.equals(that.colPervixPriladok) : that.colPervixPriladok != null)
            return false;
        if (colPolos != null ? !colPolos.equals(that.colPolos) : that.colPolos != null) return false;
        if (colSpyskov != null ? !colSpyskov.equals(that.colSpyskov) : that.colSpyskov != null) return false;
        if (cvetoproba != null ? !cvetoproba.equals(that.cvetoproba) : that.cvetoproba != null) return false;
        if (cvetoprobaComponentiVadelec != null ? !cvetoprobaComponentiVadelec.equals(that.cvetoprobaComponentiVadelec) : that.cvetoprobaComponentiVadelec != null)
            return false;
        if (dataPolycheniy != null ? !dataPolycheniy.equals(that.dataPolycheniy) : that.dataPolycheniy != null)
            return false;
        if (dataPrixodaCvetoprobi != null ? !dataPrixodaCvetoprobi.equals(that.dataPrixodaCvetoprobi) : that.dataPrixodaCvetoprobi != null)
            return false;
        if (davalcheskoe != null ? !davalcheskoe.equals(that.davalcheskoe) : that.davalcheskoe != null) return false;
        if (format1Componenti != null ? !format1Componenti.equals(that.format1Componenti) : that.format1Componenti != null)
            return false;
        if (format2Componenti != null ? !format2Componenti.equals(that.format2Componenti) : that.format2Componenti != null)
            return false;
        if (format3Componenti != null ? !format3Componenti.equals(that.format3Componenti) : that.format3Componenti != null)
            return false;
        if (format4Componenti != null ? !format4Componenti.equals(that.format4Componenti) : that.format4Componenti != null)
            return false;
        if (format5Componenti != null ? !format5Componenti.equals(that.format5Componenti) : that.format5Componenti != null)
            return false;
        if (format6Componenti != null ? !format6Componenti.equals(that.format6Componenti) : that.format6Componenti != null)
            return false;
        if (formatCvetoprob != null ? !formatCvetoprob.equals(that.formatCvetoprob) : that.formatCvetoprob != null)
            return false;
        if (idZayavki != null ? !idZayavki.equals(that.idZayavki) : that.idZayavki != null) return false;
        if (koreshok != null ? !koreshok.equals(that.koreshok) : that.koreshok != null) return false;
        if (kraskiComponentiLico != null ? !kraskiComponentiLico.equals(that.kraskiComponentiLico) : that.kraskiComponentiLico != null)
            return false;
        if (kraskiComponentiLicoN != null ? !kraskiComponentiLicoN.equals(that.kraskiComponentiLicoN) : that.kraskiComponentiLicoN != null)
            return false;
        if (kraskiComponentiOborot != null ? !kraskiComponentiOborot.equals(that.kraskiComponentiOborot) : that.kraskiComponentiOborot != null)
            return false;
        if (kraskiComponentiOborotN != null ? !kraskiComponentiOborotN.equals(that.kraskiComponentiOborotN) : that.kraskiComponentiOborotN != null)
            return false;
        if (maketComponenti != null ? !maketComponenti.equals(that.maketComponenti) : that.maketComponenti != null)
            return false;
        if (mejdy != null ? !mejdy.equals(that.mejdy) : that.mejdy != null) return false;
        if (mestoPolojenie != null ? !mestoPolojenie.equals(that.mestoPolojenie) : that.mestoPolojenie != null)
            return false;
        if (mestoRaspolojenie != null ? !mestoRaspolojenie.equals(that.mestoRaspolojenie) : that.mestoRaspolojenie != null)
            return false;
        if (nazvanieComponenti != null ? !nazvanieComponenti.equals(that.nazvanieComponenti) : that.nazvanieComponenti != null)
            return false;
        if (oborot != null ? !oborot.equals(that.oborot) : that.oborot != null) return false;
        if (obrazeccveta != null ? !obrazeccveta.equals(that.obrazeccveta) : that.obrazeccveta != null) return false;
        if (opredelennoeMesto != null ? !opredelennoeMesto.equals(that.opredelennoeMesto) : that.opredelennoeMesto != null)
            return false;
        if (otdelkaComponenti != null ? !otdelkaComponenti.equals(that.otdelkaComponenti) : that.otdelkaComponenti != null)
            return false;
        if (polosaRaspolojeniya1 != null ? !polosaRaspolojeniya1.equals(that.polosaRaspolojeniya1) : that.polosaRaspolojeniya1 != null)
            return false;
        if (polosaRaspolojeniya2 != null ? !polosaRaspolojeniya2.equals(that.polosaRaspolojeniya2) : that.polosaRaspolojeniya2 != null)
            return false;
        if (polosiCvetoprob != null ? !polosiCvetoprob.equals(that.polosiCvetoprob) : that.polosiCvetoprob != null)
            return false;
        if (polosiObrzcaCveta != null ? !polosiObrzcaCveta.equals(that.polosiObrzcaCveta) : that.polosiObrzcaCveta != null)
            return false;
        if (polosiStikov != null ? !polosiStikov.equals(that.polosiStikov) : that.polosiStikov != null) return false;
        if (recomOborydovanie != null ? !recomOborydovanie.equals(that.recomOborydovanie) : that.recomOborydovanie != null)
            return false;
        if (sposobSkrepleniya != null ? !sposobSkrepleniya.equals(that.sposobSkrepleniya) : that.sposobSkrepleniya != null)
            return false;
        if (stiki != null ? !stiki.equals(that.stiki) : that.stiki != null) return false;
        if (tipComponenti != null ? !tipComponenti.equals(that.tipComponenti) : that.tipComponenti != null)
            return false;
        if (tirajComponenti != null ? !tirajComponenti.equals(that.tirajComponenti) : that.tirajComponenti != null)
            return false;
        if (vladelecObrazcaCveta != null ? !vladelecObrazcaCveta.equals(that.vladelecObrazcaCveta) : that.vladelecObrazcaCveta != null)
            return false;
        if (zakazchikNaPechat != null ? !zakazchikNaPechat.equals(that.zakazchikNaPechat) : that.zakazchikNaPechat != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idComponenti ^ (idComponenti >>> 32));
        result = 31 * result + (idZayavki != null ? idZayavki.hashCode() : 0);
        result = 31 * result + (tipKraski != null ? tipKraski.hashCode() : 0);
        result = 31 * result + (tipComponenti != null ? tipComponenti.hashCode() : 0);
        result = 31 * result + (nazvanieComponenti != null ? nazvanieComponenti.hashCode() : 0);
        result = 31 * result + (davalcheskoe != null ? davalcheskoe.hashCode() : 0);
        result = 31 * result + (dataPolycheniy != null ? dataPolycheniy.hashCode() : 0);
        result = 31 * result + (colPolos != null ? colPolos.hashCode() : 0);
        result = 31 * result + (tirajComponenti != null ? tirajComponenti.hashCode() : 0);
        result = 31 * result + (format1Componenti != null ? format1Componenti.hashCode() : 0);
        result = 31 * result + (format2Componenti != null ? format2Componenti.hashCode() : 0);
        result = 31 * result + (kraskiComponentiLico != null ? kraskiComponentiLico.hashCode() : 0);
        result = 31 * result + (kraskiComponentiOborot != null ? kraskiComponentiOborot.hashCode() : 0);
        result = 31 * result + (kraskiComponentiLicoN != null ? kraskiComponentiLicoN.hashCode() : 0);
        result = 31 * result + (kraskiComponentiOborotN != null ? kraskiComponentiOborotN.hashCode() : 0);
        result = 31 * result + (colPantoniLico != null ? colPantoniLico.hashCode() : 0);
        result = 31 * result + (colPantoniOborot != null ? colPantoniOborot.hashCode() : 0);
        result = 31 * result + (colLakLico != null ? colLakLico.hashCode() : 0);
        result = 31 * result + (colLakOborot != null ? colLakOborot.hashCode() : 0);
        result = 31 * result + (otdelkaComponenti != null ? otdelkaComponenti.hashCode() : 0);
        result = 31 * result + (recomOborydovanie != null ? recomOborydovanie.hashCode() : 0);
        result = 31 * result + (oborot != null ? oborot.hashCode() : 0);
        result = 31 * result + (colPervixPriladok != null ? colPervixPriladok.hashCode() : 0);
        result = 31 * result + (colForm != null ? colForm.hashCode() : 0);
        result = 31 * result + (sposobSkrepleniya != null ? sposobSkrepleniya.hashCode() : 0);
        result = 31 * result + (cvetoproba != null ? cvetoproba.hashCode() : 0);
        result = 31 * result + (cvetoprobaComponentiVadelec != null ? cvetoprobaComponentiVadelec.hashCode() : 0);
        result = 31 * result + (colCvetoprob != null ? colCvetoprob.hashCode() : 0);
        result = 31 * result + (formatCvetoprob != null ? formatCvetoprob.hashCode() : 0);
        result = 31 * result + (polosiCvetoprob != null ? polosiCvetoprob.hashCode() : 0);
        result = 31 * result + (dataPrixodaCvetoprobi != null ? dataPrixodaCvetoprobi.hashCode() : 0);
        result = 31 * result + (obrazeccveta != null ? obrazeccveta.hashCode() : 0);
        result = 31 * result + (vladelecObrazcaCveta != null ? vladelecObrazcaCveta.hashCode() : 0);
        result = 31 * result + (polosiObrzcaCveta != null ? polosiObrzcaCveta.hashCode() : 0);
        result = 31 * result + (zakazchikNaPechat != null ? zakazchikNaPechat.hashCode() : 0);
        result = 31 * result + (stiki != null ? stiki.hashCode() : 0);
        result = 31 * result + (polosiStikov != null ? polosiStikov.hashCode() : 0);
        result = 31 * result + (maketComponenti != null ? maketComponenti.hashCode() : 0);
        result = 31 * result + (colSpyskov != null ? colSpyskov.hashCode() : 0);
        result = 31 * result + (format3Componenti != null ? format3Componenti.hashCode() : 0);
        result = 31 * result + (format4Componenti != null ? format4Componenti.hashCode() : 0);
        result = 31 * result + (koreshok != null ? koreshok.hashCode() : 0);
        result = 31 * result + (format5Componenti != null ? format5Componenti.hashCode() : 0);
        result = 31 * result + (format6Componenti != null ? format6Componenti.hashCode() : 0);
        result = 31 * result + (mestoPolojenie != null ? mestoPolojenie.hashCode() : 0);
        result = 31 * result + (mestoRaspolojenie != null ? mestoRaspolojenie.hashCode() : 0);
        result = 31 * result + (colCapel != null ? colCapel.hashCode() : 0);
        result = 31 * result + (polosaRaspolojeniya1 != null ? polosaRaspolojeniya1.hashCode() : 0);
        result = 31 * result + (polosaRaspolojeniya2 != null ? polosaRaspolojeniya2.hashCode() : 0);
        result = 31 * result + (mejdy != null ? mejdy.hashCode() : 0);
        result = 31 * result + (opredelennoeMesto != null ? opredelennoeMesto.hashCode() : 0);
        return result;
    }
}
