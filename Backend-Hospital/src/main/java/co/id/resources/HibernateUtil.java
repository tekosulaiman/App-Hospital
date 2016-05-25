package co.id.resources;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * @author tekosulaiman@yahoo.com
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;
    
    public static SessionFactory buildSessionFactory() {
        //Hibernate 5
        // A SessionFactory is set up once for an application!
	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure() // configures settings from hibernate.cfg.xml
            .build();
	try {
            sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
	}
	catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy( registry );
	}
        
        //Hibernate 4
        /*try {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }*/
        
        return sessionFactory;
    }
    
    /*public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }*/
}