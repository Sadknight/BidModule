package testovie;

/**
 * Created by DMalenkov on 17.11.2014.
 */
public class TestSpisokOtdelok {
    private int iDOtdelki;
    private String groupOtdelki;
    private String nazvanieOtdelki;

    public TestSpisokOtdelok(int iDOtdelki, String groupOtdelki, String nazvanieOtdelki) {
        this.iDOtdelki = iDOtdelki;
        this.groupOtdelki = groupOtdelki;
        this.nazvanieOtdelki = nazvanieOtdelki;
    }

    public int getiDOtdelki() {
        return iDOtdelki;
    }

    public void setiDOtdelki(int iDOtdelki) {
        this.iDOtdelki = iDOtdelki;
    }

    public String getGroupOtdelki() {
        return groupOtdelki;
    }

    public void setGroupOtdelki(String groupOtdelki) {
        this.groupOtdelki = groupOtdelki;
    }

    public String getNazvanieOtdelki() {
        return nazvanieOtdelki;
    }

    public void setNazvanieOtdelki(String nazvanieOtdelki) {
        this.nazvanieOtdelki = nazvanieOtdelki;
    }
}
