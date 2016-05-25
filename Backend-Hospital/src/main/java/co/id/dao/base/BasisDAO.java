package co.id.dao.base;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import co.id.resources.HibernateUtil;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public abstract class BasisDAO<T> {
    
    private Session session;
    private SessionFactory sessionFactory;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public BasisDAO(){
        sessionFactory = HibernateUtil.buildSessionFactory();
        session = sessionFactory.openSession();
    }
    
    public void save(T entity) throws HibernateException{
        session.getTransaction().begin();
        session.save(entity);
        session.getTransaction().commit();
    }
    
    public void saveOrUpdate(T entity) throws HibernateException{
        session.getTransaction().begin();
        session.saveOrUpdate(entity);
        session.getTransaction().commit();
    }
    
    public void delete(T entity) throws HibernateException{
        session.getTransaction().begin();
        session.delete(entity);
        session.getTransaction().commit();
    }
}
