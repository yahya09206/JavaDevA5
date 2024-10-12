package day56_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            if (it.next() < 4){
                it.remove();
            }
        }
        System.out.println("list = " + list);

        System.out.println("---------------------");
    }
}
