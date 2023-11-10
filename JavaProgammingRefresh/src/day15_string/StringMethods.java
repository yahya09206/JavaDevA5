package day15_string;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Muhtar";

        char ch = str.charAt(0);

        System.out.println("ch = " + ch);

        System.out.println("-----------------------------------");

        String sentence = "Hello everyone, how are you all today?";
        int totalNumberOfChars = sentence.length();
        System.out.println("totalNumberOfChars = " + totalNumberOfChars);

        String s1 = "Cybertek";
        int lastIndex = s1.length() - 1;

        char firstCharacter = s1.charAt(0);
        int lastCharacter = s1.charAt(lastIndex);

        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);

        System.out.println("-----------------------------------");

        String firstName = "John";
        String lastName = "King";

        String fullName = firstName + " " + lastName;
        String fullName2 = firstName.concat(" ").concat(lastName);

        System.out.println("fullName2 = " + fullName2);
        System.out.println("fullName = " + fullName);


    }
}
