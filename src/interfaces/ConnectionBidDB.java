package interfaces;

import java.util.List;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public interface ConnectionBidDB<T> {
    public void create(T entity);

    public void save(T entity);

    public void delete(T entity);

    List<T> getEntities();

    public List<T> getEntities(String select, String parametrName, Object parametr);
}
