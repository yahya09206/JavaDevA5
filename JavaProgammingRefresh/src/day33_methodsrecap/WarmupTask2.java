package day33_methodsrecap;

public class WarmupTask2 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        boolean r1 = contains(array, 1);
        System.out.println(r1);
    }

    public static boolean contains(int[] array, int element){

        boolean result = false;
        // or erase above line and add return true; inside if block and return false in case it's never true

        for (int each : array) {
            if (each == element){
                result = true;
            }
        }

        return result;
    }

    public static boolean contains(double[] array, int element){

        boolean result = false;
        // or erase above line and add return true; inside if block and return false in case it's never true

        for (double each : array) {
            if (each == element){
                result = true;
            }
        }

        return result;
    }

    public static boolean contains(String[] array, int element){

        boolean result = false;
        // or erase above line and add return true; inside if block and return false in case it's never true

        for (String each : array) {
            if (each.equals(element)){
                result = true;
            }
        }

        return result;
    }

    public static boolean contains(char[] array, int element){

        boolean result = false;
        // or erase above line and add return true; inside if block and return false in case it's never true

        for (char each : array) {
            if (each == element){
                result = true;
            }
        }

        return result;
    }
}
