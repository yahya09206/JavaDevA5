package practice.CollectionsReview;

import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {

        //1. create a set
        Set<Student> mySet = new HashSet<>();

        mySet.add(new Student(7, "Ibrahim"));
        mySet.add(new Student(4, "Kareem"));
        mySet.add(new Student(7, "Jordan"));

        System.out.println(mySet);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println(numSet.add(2));
        System.out.println("First repeating: " + firstRepeatingChar("java developer"));
    }

    public static Character firstRepeatingChar(String str) {
        // Create a hashmap
        Set<Character> chars = new HashSet<>();
        // Start iteration and return ch if add returns false
        for (Character ch : str.toCharArray()) if (!chars.add(ch)) return ch;
        return null;
    }
}
