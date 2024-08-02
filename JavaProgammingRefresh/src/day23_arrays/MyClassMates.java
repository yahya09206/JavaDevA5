package day23_arrays;

public class MyClassMates {
    public static void main(String[] args) {

        String[] friends = {"Sabit", "Ahmet", "Tugba", "Beryl", "Ahmet"};

        String[] friends2 = new String[5];

        System.out.println("Size: " + friends.length);

        friends2[0] = "Sabby";
        friends2[1] = "Ahmed";
        friends2[2] = "Gulistan";
        friends2[3] = "Asli";
        friends2[4] = "Aslan";

        for (int i = 0; i <= friends2.length - 1; i++){
            System.out.println(friends2[i]);
        }
    }
}
