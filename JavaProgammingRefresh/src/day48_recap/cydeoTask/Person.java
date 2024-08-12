package day48_recap.cydeoTask;

import java.time.LocalDate;

public class Person {

    private String name;
    private final char gender;
    private final int age;
    private final LocalDate dateOfBirth;

    public Person(char gender, LocalDate dateOfBirth, String name) {
        setName(name);
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear() - this.dateOfBirth.getYear();
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

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep(){
        System.out.println(name + " is sleeping....");
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth;
    }
}
