package day39_static;

class CydeoStudent{

    public String name, gender;
    public int age, ID;

    public static String schoolName = "Cydeo School";
    public static String programmingLanguage = "Java";

    public static void printSchoolName(){
        System.out.println(schoolName);
    }
}
public class StaticExamples {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent();
        System.out.println(student1.schoolName);

        CydeoStudent student2 = new CydeoStudent();
        System.out.println(student2.schoolName);

        System.out.println(student1.programmingLanguage);
        System.out.println(student2.programmingLanguage);


        System.out.println("-------------------------------------");
        System.out.println(CydeoStudent.programmingLanguage);
        System.out.println(CydeoStudent.programmingLanguage);

        student1.age = 39;

        CydeoStudent.printSchoolName();

    }
}
