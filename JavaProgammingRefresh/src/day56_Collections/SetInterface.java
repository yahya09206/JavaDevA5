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

    }
}
