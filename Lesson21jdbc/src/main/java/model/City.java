package model;

public class City {
    private Student student;

    public City(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "City{" +
                "student=" + student +
                '}';
    }
}
