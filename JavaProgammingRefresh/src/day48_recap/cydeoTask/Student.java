package day48_recap.cydeoTask;

import java.time.LocalDate;

public class Student extends Person{

    private String schoolName;
    private int id;

    public Student(String name, char gender, LocalDate dOB, String schoolName, int id) {
        super(name, gender, dOB);
        this.schoolName = schoolName;
        this.id = id;
    }
}
