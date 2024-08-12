package day48_recap.cydeoTask;

import java.time.LocalDate;

public class Cydeo {
    public static void main(String[] args) {

        Student student = new Student('F', LocalDate.of(1996, 7, 19), "Vulia", "John Williams", 554);
        student.attendClass();
    }
}
