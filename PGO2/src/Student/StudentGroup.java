package Student;

import java.util.List;

public class StudentGroup {
    private String nazwa;
    private List<Student> studentList;

    public void addStudent(Student student) {
        if (studentList.stream().anyMatch(s -> s.equals(student))) {
            throw new IllegalStateException(String.format("Student %s already exists", student));
        }
        if (!(studentList.size() < 15)) {
            throw new IllegalStateException("Maksymalna ilosc studentow wynosi 15");
        }
        studentList.add(student);
    }

    public StudentGroup(String nazwa, List<Student> studentList) {
        this.nazwa = nazwa;
        this.studentList = studentList;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}