package day33_methodsrecap;

import java.util.Arrays;

public class WarmupTask1 {
    public static void main(String[] args) {

        String[] students = {"Mohammed", "Aleksandra", "Elmira"};
        students = reverse(students);
        System.out.println(Arrays.toString(students));
        System.out.println("----------------------------");
        int[] numbers = {1, 2, 3, 4, 5};
        numbers = reverse(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("----------------------------");
        char[] chars = {'A', 'B', 'C'};
        chars = reverse(chars);
        System.out.println(Arrays.toString(chars));


    }


    public static int[] reverse(int[] array){

        int[] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++){
            result[j] = array[i];
        }

        return result;
    }

    public static String[] reverse(String[] array){

        String[] result = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++){
            result[j] = array[i];
        }

        return result;
    }

    public static double[] reverse(double[] array){

        double[] result = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++){
            result[j] = array[i];
        }

        return result;
    }

    public static char[] reverse(char[] array){

        char[] result = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++){
            result[j] = array[i];
        }

        return result;
    }


}
