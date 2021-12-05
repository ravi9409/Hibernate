import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import java.util.*;

public class Lab1A {
    private static Transaction tx;

    public static void main(String[] args) {
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        tx=session.beginTransaction();
        Student student=new Student(111,"ravi","ravi@jlc","987567",1111);
        session.save(student);
        CurrentStudent currentStudent=new CurrentStudent(222,"ranjan","ranjan@jlc","987567",2222,12312,"09:00AM","Sri");
        session.save(currentStudent);
        session.save(currentStudent);
        tx.commit();
    }

}
