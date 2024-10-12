package day56_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterable2 {
    public static void main(String[] args) {

        // Remove the name ahmed from list
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "ahmed", "John", "Mustafa", "Jamal", "Ahmed"));

        Iterator<String> iter = names.iterator();

        while (iter.hasNext()){
            String each = iter.next();
            if (each.equalsIgnoreCase("ahmed")){
                iter.remove();
            }
        }

        // short way
        //names.removeIf(p -> p.equalsIgnoreCase("ahmed"));

        System.out.println(names);
    }
}
