package day48_recap.cydeoTask;

import java.time.LocalDate;

public class Student extends Person{

    private String schoolName;
    private int studentID;

    public Student(char gender, LocalDate dateOfBirth, String name, String schoolName, int studentID) {
        super(gender, dateOfBirth, name);
        setSchoolName(schoolName);
        setStudentID(studentID);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void study(){
        System.out.println(getName() + " is studying");
    }

    public void attendClass(){
        System.out.println(getName() + " is attending class");
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "schoolName='" + schoolName + '\'' +
                ", studentID=" + studentID +
                '}';
    }
}
