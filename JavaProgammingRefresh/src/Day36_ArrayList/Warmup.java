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
        // multiply odd numbers by 2 and replace with original
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        for (int i = 0; i < list2.size(); i++) {
            if (list.get(i) % 2 != 0){
                list2.set(i, list2.get(i) * 2);
            }
        }

        System.out.println(list2);


    }
}
