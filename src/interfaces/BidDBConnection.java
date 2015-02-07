package interfaces;

import java.util.List;

/**
 * Created by DMalenkov on 25.09.2014.
 */
public interface BidDBConnection<T> {
    public void create(T entity);

    public void edit(T entity);

    public void remove(T entity);

    public List<T> findAll();
//    public String create();
//    public String save();
}
