package day39_static;

public class StaticExamples {
    public static void main(String[] args) {

        CybertekStudent student1 = new CybertekStudent();
        CybertekStudent student2 = new CybertekStudent();
        CybertekStudent student3 = new CybertekStudent();
        CybertekStudent student4 = new CybertekStudent();
        //student1.schoolName = "Cybertek School";

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
        System.out.println(student3.schoolName);
        System.out.println(student4.schoolName);


    }
}

class CybertekStudent {

    public String name, gender;
    public int age, ID;
    public static String schoolName = "Cybertek School";
    public static String programmingLanguage = "Java";
}
