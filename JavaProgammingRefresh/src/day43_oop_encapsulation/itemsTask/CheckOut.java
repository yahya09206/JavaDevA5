package day43_oop_encapsulation.itemsTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckOut {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(
                MyCart.item1,
                MyCart.item2,
                MyCart.item3,
                MyCart.item4,
                MyCart.item5
        ));
    }
}
