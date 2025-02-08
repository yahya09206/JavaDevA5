package day23_arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] group12 = {"Gulistan", "Nazli", "Ahmad", "Ahmet", "Aykut"};

        System.out.println("group12 = " + group12[1]);
        System.out.println("group12 = " + group12[2]);

        System.out.println("------------------------------");
        // loop through array
        for (int i = 0; i <= group12.length - 1; i++){
            System.out.println(group12[i]);
        }

    }
}
