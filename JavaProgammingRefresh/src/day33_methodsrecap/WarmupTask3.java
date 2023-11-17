package day33_methodsrecap;

public class WarmupTask3 {


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
