package day40_statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlocks {

    public static int a = 100;
    public static ArrayList<String> list = new ArrayList<>();

    static {
        list.addAll(Arrays.asList("A", "B", "C"));
    }
}
