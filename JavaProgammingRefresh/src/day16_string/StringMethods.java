package day16_string;

public class StringMethods {
    public static void main(String[] args) {

        String email = "Cydeo@yahoo.com";
        email = email.replace("yahoo", "gmail");

        System.out.println(email);

        String sentence = "C# is fun, C# is cool";
        sentence = sentence.replace("C#", "Java");
        System.out.println("sentence = " + sentence);


    }
}
