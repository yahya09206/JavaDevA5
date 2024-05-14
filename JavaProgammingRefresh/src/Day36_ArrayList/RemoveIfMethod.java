package Day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,3,4,3,22,4,5,6,7,88,76,545,476,89));

        System.out.println("list = " + list);

        // remove odd numbers without using a loop but use removeIf()
        list.removeIf(p -> p % 2 != 0);

        System.out.println("list = " + list);

        System.out.println("------------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmad", "Merve", "Feruza", "Said", "Komiljon", "Selda", "Fhilipp"));

        System.out.println("names = " + names);
        names.removeIf(p -> p.toLowerCase().contains("a"));
        System.out.println("names = " + names);

        System.out.println("------------------------------------------------------------");

    }
}
