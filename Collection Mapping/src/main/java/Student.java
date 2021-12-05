import javax.persistence.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "mystudents")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int sid;

    @Column(name = "sname")
    private String sname;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @ElementCollection
    @CollectionTable(name = "mycourses",joinColumns = @JoinColumn(name = "mysid"))
    @Column(name = "courseName")
    @OrderColumn(name = "learningOrder")
    private String[] courses;

    @ElementCollection
    @CollectionTable(name = "myskills",joinColumns = @JoinColumn(name = "sid"))
    @Column(name = "skillsName")
    @OrderColumn(name = "expertiseOrder")
    private List<String> skills;

    @ElementCollection
    @CollectionTable(name = "mymarks",joinColumns = @JoinColumn(name = "mysid"))
    @Column(name = "marksObtained")
    private List<Integer> marks;

    @ElementCollection
    @CollectionTable(name = "myinterviews",joinColumns = @JoinColumn(name = "mysid"))
    @Column(name = "companyName")
    private Set<String> interviews;

    @ElementCollection
    @CollectionTable(name = "myrefs",joinColumns = @JoinColumn(name = "mysid"))
    @Column(name = "refPhone")
    @MapKeyColumn(name = "refName")
    private Map<String,Integer> refs;

    public Student(){}

    public Student(int sid, String sname, String email, String phone) {
        this.sid = sid;
        this.sname = sname;
        this.email = email;
        this.phone = phone;
    }

    public Student(String sname, String email, String phone) {
        this.sname = sname;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", skills=" + skills +
                ", marks=" + marks +
                ", interviews=" + interviews +
                ", refs=" + refs +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public Set<String> getInterviews() {
        return interviews;
    }

    public void setInterviews(Set<String> interviews) {
        this.interviews = interviews;
    }

    public Map<String, Integer> getRefs() {
        return refs;
    }

    public void setRefs(Map<String, Integer> refs) {
        this.refs = refs;
    }
}
