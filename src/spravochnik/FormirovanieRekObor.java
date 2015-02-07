package spravochnik;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DMalenkov on 03.12.2014.
 */
public class FormirovanieRekObor {
    private String tipPechati;

    public FormirovanieRekObor(String tipPechati) {
        this.tipPechati = tipPechati;
    }

    public List<String> getSpisok() {
        List<String> spisok = new ArrayList<>();
        spisok.add("---");
        if (tipPechati.equals("HSWO")) {
            spisok.add("Lithoman I");
            spisok.add("Lithoman II");
            spisok.add("Rotoman I");
            spisok.add("Rotoman II");
            spisok.add("Uniset");
        }
        if (tipPechati.equals("CSWO")) {
            spisok.add("Uniset");
        }
        if (tipPechati.equals("Sheet")) {
            spisok.add("Roland 1");
            spisok.add("Roland 2");
        }
        return spisok;
    }
}
