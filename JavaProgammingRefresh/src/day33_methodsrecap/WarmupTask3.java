package day33_methodsrecap;

import utilities.ArraysUtility;

import java.util.Arrays;

public class WarmupTask3 {
    public static void main(String[] args) {

        int[] array = {1, 1, 1, 2, 3, 3, 4, 5, 5, 6};
        int[] result = {};

        for (int each : array) {
            if (frequency(array, each) == 1){
                result = ArraysUtility.addElement(result, each);
            }
        }

        System.out.println(Arrays.toString(result));
    }

    public static int[] unique(int[] array){
        int[] result = {};

        for (int each : array) {
            if (frequency(array, each) == 1){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static double[] unique(double[] array){

        double[] result = {};

        for (double each : array) {
            if (frequency(array, (int)each) == 1){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    public static String[] unique(String[] array){
        String[] result = {};

        for (String each : array) { // getting each elements
            if(  frequency(array, each)  == 1   ){ // unique element
                result =  ArraysUtility.addElement(result, each );
            }
        }

        return result;
    }

    public static char[] unique(char[] array){
        char[] result = {};

        for (char each : array) { // getting each elements
            if(  frequency(array, each)  == 1   ){ // unique element
                result =  ArraysUtility.addElement(result, each );
            }
        }

        return result;
    }


    public static int frequency(int[] array, int element){
        // keep track of elements and how many times they appear
        int count = 0;

        // go thru each element in array
        for (int each : array) {
            // an element has already been seen before then add it to the count variable
            if (each == element){
                count++;
            }
        }
        // return count
        return count;
    }

    public static int frequency(double[] array, int element){
        // keep track of elements and how many times they appear
        int count = 0;

        // go thru each element in array
        for (double each : array) {
            // an element has already been seen before then add it to the count variable
            if (each == element){
                count++;
            }
        }
        // return count
        return count;
    }

    public static int frequency(String[] array, String element){
        // keep track of elements and how many times they appear
        int count = 0;

        // go thru each element in array
        for (String each : array) {
            // an element has already been seen before then add it to the count variable
            if (each.equals(element)){
                count++;
            }
        }
        // return count
        return count;
    }

    public static int frequency(char[] array, char element){
        // keep track of elements and how many times they appear
        int count = 0;

        // go thru each element in array
        for (int each : array) {
            // an element has already been seen before then add it to the count variable
            if (each == element){
                count++;
            }
        }
        // return count
        return count;
    }
}
