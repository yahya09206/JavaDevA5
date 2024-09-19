package Day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Warmup {
    public static void main(String[] args) {

        //Set last element of arrayList to 0
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        // use set method to replace last element to 0
        list.set(list.size() - 1, 0);

        System.out.println("-----------------------------------------");

    }
}
