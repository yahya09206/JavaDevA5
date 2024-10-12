package day55_Collections;

import java.util.*;

public class CollectionIntro {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new Vector<>();
        List<Integer> list4 = new Stack<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        Set<Integer> set3 = new TreeSet<>();

        Queue<Integer> queue = new PriorityQueue<>();
        Queue<Integer> queue2 = new ArrayDeque<>();
        Queue<Integer> queue3 = new LinkedList<>();

        System.out.println("------------------------------------------");
        // Allows dupes and has index number
        List<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list5.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(list);

        // Does not have index number & Doesn't allow dupes so the best way to remove them is to use a set
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        set.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        set.remove(10);
        System.out.println(set);

        // Allows dupes but does not have index number
        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        queue1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(queue1);

        System.out.println("---------------------------------------------");
        // Remove all elements less than 7
        set.removeIf(p -> p < 7);
        System.out.println(set);

    }
}
