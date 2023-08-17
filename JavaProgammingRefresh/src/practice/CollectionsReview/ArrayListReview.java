package practice.CollectionsReview;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReview {
    public static void main(String[] args) {

        // Create ArrayList and a Class
        List<Student> students = new ArrayList<>();

        // Add elements to ArrayList
        students.add(new Student(1, "Jose"));
        students.add(new Student(2, "Sayed"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4, "Ronnie"));

        for (Student student : students) {
            System.out.println(student);
        }

    }
}
