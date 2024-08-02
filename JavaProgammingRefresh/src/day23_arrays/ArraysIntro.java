package day23_arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] group2 = {"Feruza", "Kadir", "Ahmet", "Gulistan", "Aykut"};

        System.out.println(group2[0]);
        System.out.println(group2[1]);
        System.out.println(group2[2]);

        System.out.println("------------------------");

        for (int i = 0; i <= group2.length - 1; i++){
            System.out.println(group2[i]);
        }
    }
}
