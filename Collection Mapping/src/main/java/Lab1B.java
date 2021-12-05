import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lab1B {
    private static Transaction tx;

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        tx = session.beginTransaction();
        Student student = session.load(Student.class, 1);
        System.out.println(student.getSid());
        System.out.println(student.getSname());
        System.out.println(student.getEmail());
        System.out.println(student.getPhone());
        String[] courses = student.getCourses();
        for (String c : courses
        ) {
            System.out.println(c);
        }
        System.out.println("---------------------------");
        List<String> skills = student.getSkills();
        for (String skill : skills
        ) {
            System.out.println(skill);
        }
        System.out.println("---------------------------");
        List<Integer> marks = student.getMarks();
        for (Integer a : marks
        ) {
            System.out.println(a);
        }
        System.out.println("---------------------------");
        Set<String> interviews = student.getInterviews();
        for (String a : interviews
        ) {
            System.out.println(a);
        }
        System.out.println("---------------------------");
        Map<String, Integer> refs = student.getRefs();
        for (String a : refs.keySet()
        ) {
            Integer val = refs.get(a);
            System.out.println(a + "\t" + val);
        }
    }
}
