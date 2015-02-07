package sessionsBidDB;

import interfaces.ConnectionBidDB;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;
import java.util.List;

/**
 * Created by DMalenkov on 01.10.2014.
 */
public class AbstractFacadeBidDB<T> implements ConnectionBidDB<T>, Serializable {

    private String SELECT_ALL_ENTITIES_SQL;
    //Переменная ентити фабрики
    private EntityManagerFactory myEntityManagerFactory;
    private T myEntity;

    //Создаем фабрику ентити в конструкторе
    public AbstractFacadeBidDB(Class<T> entityClass, String select_all_entities_sql) {
        SELECT_ALL_ENTITIES_SQL = select_all_entities_sql;
        myEntityManagerFactory = Persistence.createEntityManagerFactory("BidDB");
    }

    private EntityManagerFactory getEntityManagerFactory() {
        return myEntityManagerFactory;
    }

    public T getEntity() {
        return myEntity;
    }

    //Создание четко обозначеного Ентити
    @Override
    public void create(T entity) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            try {
                entityManager.getTransaction().rollback();
            } catch (Exception e) {
            }
        }
        entityManager.close();
    }

    @Override
    public void save(T entity) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();
            myEntity = entityManager.merge(entity);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            try {
                entityManager.getTransaction().rollback();
            } catch (Exception e) {
            }
        }
        entityManager.close();
    }

    @Override
    public void delete(T entity) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entity = entityManager.merge(entity);
            entityManager.remove(entity);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            try {
                entityManager.getTransaction().rollback();
            } catch (Exception e) {
            }
        }
        entityManager.close();
    }


    public List<T> getEntities() {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        List<T> entities = (List<T>) entityManager.createQuery(SELECT_ALL_ENTITIES_SQL).getResultList();
        entityManager.close();
        return entities;
    }

    public List<T> getEntities(String select, String parametrName, Object parametr) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        List<T> entities = (List<T>) entityManager.createQuery(select).setParameter(parametrName, parametr).getResultList();
        entityManager.close();
        return entities;
    }
}
