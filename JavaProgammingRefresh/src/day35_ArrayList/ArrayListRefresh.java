package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListRefresh {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1, 2);
        System.out.println(numbers);
        System.out.println(numbers.get(3));

        for (int i = 0; i <= numbers.size() - 1; i++){
            System.out.println(numbers.get(i));
        }

    }
}
