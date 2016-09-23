
import java.util.List;

public class Division {

    private String divisionName;
    private List<Ward> wards;
    private List<Doctor> doctors;
    private List<Nurse> nurses;
    private List<Staff> staffes;

    public Division(String divisionName, List<Ward> wards, List<Doctor> doctors, List<Nurse> nurses, List<Staff> staffes) {
        this.divisionName = divisionName;
        this.wards = wards;
        this.doctors = doctors;
        this.nurses = nurses;
        this.staffes = staffes;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public List<Ward> getWards() {
        return wards;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public List<Staff> getStaffes() {
        return staffes;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public void setWards(List<Ward> wards) {
        this.wards = wards;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    public void setStaffes(List<Staff> staffes) {
        this.staffes = staffes;
    }

    @Override
    public String toString() {
        return "Division{" + "divisionName=" + divisionName + ", wards=" + wards + ", doctors=" + doctors + ", nurses=" + nurses + ", staffes=" + staffes + '}';
    }
    
}
