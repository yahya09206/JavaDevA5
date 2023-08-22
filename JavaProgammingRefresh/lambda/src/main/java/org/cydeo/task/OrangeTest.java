package org.cydeo.task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
    }
}
