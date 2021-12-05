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
        Student student=new Student(101,"ravi","ravi@jlc","1111");
        String[] courses={"Java","JDBC","JSP","Servlets"};
        List<String> skills=new ArrayList<String>();
        skills.add("Java");
        skills.add("JDBC");
        skills.add("JSP");
        skills.add("Servlets");
        student.setSkills(skills);
        List<Integer> marks=new ArrayList<Integer>();
        marks.add(50);
        marks.add(60);
        marks.add(70);
        student.setMarks(marks);
        Set<String> interviews=new HashSet<String>();
        interviews.add("Capgemini");
        interviews.add("TCS");
        interviews.add("Infosys");
        student.setInterviews(interviews);
        Map<String,Integer> refs=new HashMap<String,Integer>();
        refs.put("aaa",111);
        refs.put("BBB",222);
        refs.put("ccc",333);
        student.setRefs(refs);
        session.save(student);
        tx.commit();
    }

}
