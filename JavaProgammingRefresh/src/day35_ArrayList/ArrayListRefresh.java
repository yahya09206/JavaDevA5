package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListRefresh {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(200);
        numbers.add(300);
        numbers.add(200);
        System.out.println("numbers = " + numbers);
        System.out.println("numbers.size() = " + numbers.size());
        numbers.remove(2);
        System.out.println("numbers = " + numbers);
        System.out.println("numbers.size() = " + numbers.size());
        numbers.add(20);
        numbers.add(2, 300);
        System.out.println("numbers = " + numbers);

        for (Integer number : numbers) {
            System.out.println("number = " + number);
        }

        for (int i = 0; i <= numbers.size() - 1; i++){
            System.out.println("numbers.get(i) = " + numbers.get(i));
        }

    }
}
