import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "cstudents")
@PrimaryKeyJoinColumn(name = "mysid")
public class CurrentStudent extends  Student{

    @Column(name = "feebal")
    private double feebal;

    @Column(name = "timings")
    private String timings;

    @Column(name = "trainer")
    private String trainer;

    public CurrentStudent() {

    }

    public CurrentStudent(int sid, String sname, String email, String phone, double totalFee, double feebal, String timings, String trainer) {
        super(sid, sname, email, phone, totalFee);
        this.feebal = feebal;
        this.timings = timings;
        this.trainer = trainer;
    }

    public CurrentStudent(String sname, String email, String phone, double totalFee, double feebal, String timings, String trainer) {
        super(sname, email, phone, totalFee);
        this.feebal = feebal;
        this.timings = timings;
        this.trainer = trainer;
    }

    public double getFeebal() {
        return feebal;
    }

    public void setFeebal(double feebal) {
        this.feebal = feebal;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;

    }

    @Override
    public String toString() {
        return "CurrentStudent{" +
                "feebal=" + feebal +
                ", timings='" + timings + '\'' +
                ", trainer='" + trainer + '\'' +
                '}';
    }
}
