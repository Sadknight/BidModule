package staticClass;

import model.Ad;

/**
 * Created by DMalenkov on 24.02.2015.
 */
public class Test implements TestIntr {

    private Ad ad;

    Test() {
    }

    public Ad getAd() {
        return ad;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
    }
}
