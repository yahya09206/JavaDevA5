package day56_Collections;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon"};

        // No order
        Set<String> items = new HashSet<>(Arrays.asList(arr));
        items.add(null);
        // Insertion order
        Set<String> items2 = new LinkedHashSet<>(Arrays.asList(arr));
        items2.add(null);
        // Sorted order Ascending, does not accept null
        Set<String> items3 = new TreeSet<>(Arrays.asList(arr));
        // items3.add(null);

        System.out.println("items = " + items);
        System.out.println("items2 = " + items2);
        System.out.println("items3 = " + items3);

        System.out.println("------------------------------------------------");
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list = new ArrayList<>(new LinkedHashSet<Integer>(list));

        System.out.println(list);

        System.out.println("-----------------------");
        Integer[] nums = {1,1,1,2,3,3,4,5,5,6,6,7,};
        // Remove duplicates and return the 5th element
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(nums));
        System.out.println(linkedHashSet);
        // convert to array list and select 5th element
        System.out.println(new ArrayList<>(linkedHashSet).get(4));

        System.out.println("----------------------------------");
        // "aaaabbbbccc" ==> a4b4c3
        String s = "aaaabbbbccc";
        String result = "";
        for (String ch : new LinkedHashSet<>(Arrays.asList(s.split("")))) { // no duped characters
           result += ch + Collections.frequency(Arrays.asList(s.split("")), ch); // concat char with index
        }

        System.out.println("result = " + result);
    }
}
