import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class HibernateUtil {

    static SessionFactory sessionFactory=null;
    static {
        Configuration configuration=new Configuration();
        Properties properties=new Properties();
        properties.put(Environment.URL,"jdbc:mysql://localhost:3306/test");
        properties.put(Environment.USER,"root");
        properties.put(Environment.PASS,"root");
        properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
        properties.put(Environment.SHOW_SQL,"true");
        properties.put(Environment.HBM2DDL_AUTO,"update");
        properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        configuration.setProperties(properties);
        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(CurrentStudent.class);
        StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory=configuration.buildSessionFactory(serviceRegistry);
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
