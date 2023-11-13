package day23_arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] group1 = {"Feruza", "Yulian", "Tamara", "Ahmet"};

        // retrieve data from array
        System.out.println(group1[0]);
        System.out.println(group1[1]);
        System.out.println(group1[2]);
        System.out.println(group1[3]);

        System.out.println("----------------------------------------------");

        for (int i = 0; i <= group1.length - 1; i++){
            System.out.println(group1[i]);
        }

    }
}
