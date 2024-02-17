package day19_forloops;

public class StringReverse {
    public static void main(String[] args) {

        String name = "Mikey";
        String reversedName = "";

        for (int i = name.length() - 1; i >= 0; i--){
            char each = name.charAt(i);
            reversedName += each;
        }

        System.out.println(reversedName);

    }
}
