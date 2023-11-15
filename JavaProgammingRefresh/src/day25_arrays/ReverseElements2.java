package day25_arrays;

public class ReverseElements2 {
    public static void main(String[] args) {

        String[] array = {"Java", "Python", "C#", "Racecar"};

        for (String elements : array) {
            String reverse = "";
            for (int i = elements.length() - 1; i >= 0; i--){
                reverse += elements.charAt(i);
            }

            System.out.print(" " + reverse);
        }
    }
}
