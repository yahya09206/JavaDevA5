package day25_arrays;

import java.util.Arrays;

public class ReverseElements {
    public static void main(String[] args) {

        String[] array = {"Java", "Python", "C#"};

        for (int j = 0; j <= array.length - 1; j++){
            String element = array[j];
            String reversed = "";

            for (int i = element.length() - 1; i >= 0; i--){
                reversed += element.charAt(i);
            }
            array[j] = reversed;
        }


        System.out.println(Arrays.toString(array));


    }
}
