package day23_arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        // Declare array
        String[] group10 = {"James", "Maria", "Mikey", "Anthony", "Annie"};
        // Retrieve
        System.out.println(group10[2]);

        // Loop thru and print out names
        for (int i = 0; i <= group10.length - 1; i++){
            System.out.println(group10[i]);
        }


    }
}
