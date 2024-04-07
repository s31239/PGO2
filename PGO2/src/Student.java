import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;


public class Student {
    private String fname;
    private String lname;
    private String indexNumber;
    private String email;
    private String address;
    private List<Double> grades;

    public void addGrade(Double grade) {
        if (grades.size() < 20) {
            grades.add(grade);
        } else {
            System.out.println("Student can have maximum 20 grades");
        }
    }

    public Double calculateMean() {
        if (this.grades.isEmpty()) {
            throw new IllegalArgumentException("Student does not have any grades");
        }
        return grades.stream().mapToDouble(grade -> grade).sum() / grades.size();
    }

    public Student(String fname, String lname, String indexNumber,
                   String email, String address, List<Double> grades) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = grades;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return indexNumber == student.indexNumber && Objects.equals(fname, student.fname) && Objects.equals(lname, student.lname) && Objects.equals(email, student.email) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fname, lname, indexNumber, email, address);
    }
}