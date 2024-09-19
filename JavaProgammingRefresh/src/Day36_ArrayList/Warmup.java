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
            if (list2.get(i) % 2 != 0){
                list2.set(i, list2.get(i) * 2);
            }
        }

        System.out.println(list2);

        System.out.println("----------------------------------------");
        // combine 2 string arrays and add to new string array
        String[] arr1 = {"A","B","C"},
                arr2 = {"D", "E", "F"};

        ArrayList<String> result = new ArrayList<>(Arrays.asList(arr1));
        result.addAll(Arrays.asList(arr2));

        System.out.println(result);

    }
}
