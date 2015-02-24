package staticClass;

import model.Ad;

import java.io.Serializable;

/**
 * Created by DMalenkov on 24.02.2015.
 */
public interface TestIntr extends Serializable {
    public Ad getAd();

    public void setAd(Ad ad);
}
