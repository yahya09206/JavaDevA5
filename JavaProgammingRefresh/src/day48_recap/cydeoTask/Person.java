package day48_recap.cydeoTask;

import java.time.LocalDate;

public class Person {

    private String name;
    private final char gender;
    private final int age;
    private final LocalDate dOB;

    public Person(String name, char gender, int age, LocalDate dOB) {
        setName(name);
        this.gender = gender;
        this.age = age;
        this.dOB = dOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getdOB() {
        return dOB;
    }
}
