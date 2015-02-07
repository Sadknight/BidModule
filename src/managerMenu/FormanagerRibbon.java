package managerMenu;

import javax.annotation.PostConstruct;

/**
 * Created by DMalenkov on 23.12.2014.
 */
public class FormanagerRibbon {
    private int indexRibbon;

    @PostConstruct
    private void newClass() {
        indexRibbon = 0;
    }

    public int getIndexRibbon() {
        return indexRibbon;
    }

    public void setIndexRibbon(int indexRibbon) {
        this.indexRibbon = indexRibbon;
    }
}
