import javax.persistence.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "mystudents")
@Inheritance(strategy = InheritanceType.JOINED)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int sid;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", totalFee=" + totalFee +
                '}';
    }

    @Column(name = "sname")
    private String sname;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "totalFee")
    private double totalFee;

    public Student(){}

    public Student(int sid, String sname, String email, String phone,double totalFee) {
        this.sid = sid;
        this.sname = sname;
        this.email = email;
        this.phone = phone;
        this.totalFee = totalFee;
    }

    public Student(String sname, String email, String phone, double totalFee) {
        this.sname = sname;
        this.email = email;
        this.phone = phone;
        this.totalFee = totalFee;
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

    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }
}
