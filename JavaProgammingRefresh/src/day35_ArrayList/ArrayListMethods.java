package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("Milk");
        groceryList.add("Water");
        groceryList.add("Vinegar");
        groceryList.add("Bread");
        System.out.println(groceryList);

        groceryList.set(0, "Toilet Paper");
        groceryList.set(3, "Soda");

        System.out.println("groceryList = " + groceryList);

        System.out.println("-----------------------");

        groceryList.remove(1);
        System.out.println("groceryList = " + groceryList);

        groceryList.remove("Water");
        System.out.println(groceryList);
    }
}
