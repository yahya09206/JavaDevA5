package practice.CollectionsReview;

import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {

        // Create ArrayList and a Class
        List<Student> students = new ArrayList<>();

        // Add elements to ArrayList
        students.add(new Student(1, "Jose"));
        students.add(new Student(2, "Sayed"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4, "Ronnie"));

        // legacy for loop
        for (int i = 0; i <= students.size() - 1; i++){
            System.out.println(students.get(i));
        }

        System.out.println("Reverse----------------------");

        // backward
        for (int i = students.size() - 1; i >= 0; i--){
            System.out.println(students.get(i));
        }

        System.out.println("Iterator----------------------");
        // 2. Iterator
        Iterator iter = students.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("Iterator reverse----------------------");
        // 2. Iterator
        while (((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }

        System.out.println("forEach()----------------------");
        // for each
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Lambda-------------------");
        students.forEach(student -> System.out.println(student));

        System.out.println("Sorting-------------------");
        Collections.sort(students, new sortByIdDesc());
        System.out.println(students);
    }

    static class sortByIdDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2){
            return o1.id-o2.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2){
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
