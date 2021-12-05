import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lab1B {
    private static Transaction tx;

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        tx = session.beginTransaction();
        Student student =session.load(Student.class, 2);
        System.out.println(student);
        CurrentStudent currentStudent = session.load(CurrentStudent.class, 3);
        System.out.println(currentStudent);
    }
}
