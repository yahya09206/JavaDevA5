package day16_string;

public class StringMethods {
    public static void main(String[] args) {

        // Replace first method
        String email = "Cydeo@yahoo.com";
        // replacing yahoo with gmail
        email = email.replace("yahoo", "gmail");

        System.out.println(email);

        // replace method
        String sentence = "C# is fun, C# is cool";
        sentence = sentence.replace("C#", "Java");
        System.out.println("sentence = " + sentence);


    }
}
