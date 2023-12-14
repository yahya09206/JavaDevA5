package day48_recap.cydeoTask;

import java.time.LocalDate;

public class Person {

    private final String name;
    private final char gender;
    private final int age;
    private final LocalDate dOB;

    public Person(String name, char gender, int age, LocalDate dOB) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.dOB = dOB;
    }
}
