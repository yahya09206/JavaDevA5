package Day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,6,6,6,6,7,7,7,7,8,8));

        list.removeIf(p -> p % 2 == 0);

        System.out.println(list);

        list.removeIf(p -> p < 5);
        System.out.println(list);

        System.out.println("---------------------------------------------");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmad", "Rerve", "Feruza", "Said", "Selda"));

        names.removeIf(p -> p.toLowerCase().contains("a"));
        System.out.println(names);


        System.out.println("---------------------------------------------");
        //Remove all palindromes from array
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("racecar", "level", "python", "javaj", "anna", "mike"));

        //words.removeIf(p -> StringUtility.isPalindrome(p));

        //System.out.println(words);

        for (String each : words) {
            String reversed = "";
            for (int i = each.length() - 1; i >= 0; i--){
                reversed += each.charAt(i);
            }

            boolean isPalindrome = reversed.equalsIgnoreCase(each);
            words.removeIf(p -> isPalindrome);
        }

        System.out.println(words);

    }
}
