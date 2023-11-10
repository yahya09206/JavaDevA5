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

        char firstCharacter = s1.charAt(0);
        char lastCharacter = s1.charAt(7);

        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);


    }
}
