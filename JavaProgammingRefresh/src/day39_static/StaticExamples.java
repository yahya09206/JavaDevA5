package day39_static;

class SchoolStudent {

    public String name;
    public String gender;
    public int age;
    public long idNumber;

    public static String schoolName = "John Williams";
    public static String programmingLanguage = "Java";

    public void printName(){
        System.out.println(name);
    }
}

public class StaticExamples {

    public static void main(String[] args) {

        SchoolStudent schoolStudent = new SchoolStudent();
        schoolStudent.schoolName = "John Williams";

        System.out.println("schoolStudent.name = " + schoolStudent.schoolName);

        SchoolStudent schoolStudent2 = new SchoolStudent();
        SchoolStudent schoolStudent3 = new SchoolStudent();
        SchoolStudent schoolStudent4 = new SchoolStudent();
        SchoolStudent schoolStudent5 = new SchoolStudent();

        System.out.println("schoolStudent2.schoolName = " + schoolStudent2.schoolName);
        System.out.println("schoolStudent3.programmingLanguage = " + schoolStudent3.programmingLanguage);

        System.out.println("----------------------------------------------------");
        System.out.println(SchoolStudent.schoolName);
        System.out.println(SchoolStudent.programmingLanguage);

        System.out.println(schoolStudent.age);

    }
}
