package Day37_CustomClasses;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public String size;
    public String color;
    public String gender;

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

    public void play(){
        System.out.println(name + " is playing");
    }

    public void setInfo(String dogName, String dogBreed, String dogGender, String dogColor, String dogSize, int dogAge){

        dogName = name;
        dogBreed = breed;
        dogGender = gender;
        dogColor = color;
        dogSize = size;
        dogAge = age;
    }
}
