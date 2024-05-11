package day25_arrays;

import java.util.Arrays;

public class ReverseElements {
    public static void main(String[] args) {

        String[] array = {"Java", "Python", "C#"};

        for (int j = 0; j <= array.length - 1; j++){
            String getElm = array[j];
            String reverse = "";
            for (int i = getElm.length() - 1; i >= 0; i--){
                // char each = getElm.charAt(i);
                reverse += ""+getElm.charAt(i);
            }

            array[j] = reverse;
        }

        System.out.println(Arrays.toString(array));

    }
}
