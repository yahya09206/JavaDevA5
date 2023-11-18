package day33_methodsrecap;

import utilities.ArraysUtility;

import java.util.Arrays;

public class WarmupTask4 {
    public static void main(String[] args) {

        String str = "aaaabbbbcccc";
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++){
            char each = str.charAt(i);
            // check if char has been seen
            if (!result.contains("" + each)){
                result += each;
            }
        }

        System.out.println(result);

        System.out.println("--------------------------");
        int[] array = {1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5};
        int[] newArr = {};

        for (int each : array) {
            if (!ArraysUtility.contains(newArr, each)){
                newArr = ArraysUtility.addElement(newArr, each);
            }
        }

        System.out.println(Arrays.toString(newArr));

    }

    public static int[] removeDup(int[] array){
        int[] newArr = {};

        for (int each : array) {
            if( !ArraysUtility.contains(newArr, each)){
                newArr = ArraysUtility.addElement(newArr, each );
            }
        }

        return newArr;
    }

    public static double[] removeDup(double[] array){
        double[] newArr = {};

        for (double each : array) {
            if( !ArraysUtility.contains(newArr, each)){
                newArr = ArraysUtility.addElement(newArr, each );
            }
        }

        return newArr;
    }

    public static String[] removeDup(String[] array){
        String[] newArr = {};

        for (String each : array) {
            if( !ArraysUtility.contains(newArr, each)){
                newArr = ArraysUtility.addElement(newArr, each );
            }
        }

        return newArr;
    }

    public static char[] removeDup(char[] array){
        char[] newArr = {};

        for (char each : array) {
            if( !ArraysUtility.contains(newArr, each)){
                newArr = ArraysUtility.addElement(newArr, each );
            }
        }

        return newArr;
    }
}
