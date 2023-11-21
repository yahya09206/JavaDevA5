package day43_oop_encapsulation.itemsTask;

import java.util.ArrayList;
import java.util.Arrays;

import static day43_oop_encapsulation.itemsTask.MyCart.*;

public class CheckOut {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(
                item1,
                item2,
                item3,
                item4,
                item5
        ));

        double totalCost = 0;
        for (Item eachItem : items) {

            totalCost += eachItem.calcCost() * 1.08;
        }
    }
}
