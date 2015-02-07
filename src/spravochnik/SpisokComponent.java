package spravochnik;

/**
 * Created by DMalenkov on 01.12.2014.
 */
public class SpisokComponent {
    private String nazvanieComponenti;
    private int nomerNazvaniya;

    SpisokComponent() {
    }

    SpisokComponent(String nazvanieComponenti, int nomerNazvaniya) {
        this.nazvanieComponenti = nazvanieComponenti;
        this.nomerNazvaniya = nomerNazvaniya;
    }

    public String getNazvanieComponenti() {
        return nazvanieComponenti;
    }

    public void setNazvanieComponenti(String nazvanieComponenti) {
        this.nazvanieComponenti = nazvanieComponenti;
    }

    public int getNomerNazvaniya() {
        return nomerNazvaniya;
    }

    public void setNomerNazvaniya(int nomerNazvaniya) {
        this.nomerNazvaniya = nomerNazvaniya;
    }
    //    List<String>
//
//    SpisokComponent(int tipProdykta){
//            switch (tipProdykta) {
//                case 0:
//    }
}
