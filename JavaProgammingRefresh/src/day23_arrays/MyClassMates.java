package day23_arrays;

public class MyClassMates {
    public static void main(String[] args) {

        String[] friends = {"Sabit", "Ahmet", "Tugba", "Beryl", "Ahmet"};

        String[] friends2 = new String[5];
        System.out.println("Size: " + friends2.length);
        friends2[0 ] = "Sabit";
        friends2[1 ] = "Ahmet";
        friends2[2 ] = "Tugba";
        friends2[3 ] = "Beryl";
        friends2[4 ] = "Ahmet";


        for (int i = 0; i <= friends2.length - 1; i++){
            System.out.println(friends2[i]);
        }
    }
}
