package day48_recap.cydeoTask;

import java.time.LocalDate;

public class Person {

    private String name;
    private final char gender;
    private final int age;
    private final LocalDate dateOfBirth;

    public Person(char gender, int age, LocalDate dateOfBirth, String name) {
        this.gender = gender;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
