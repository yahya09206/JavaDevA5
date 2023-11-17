package day33_methodsrecap;

public class WarmupTask1 {


    public static int[] reverse(int[] array){

        int[] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--){
            result[j] = array[i];
        }

        return result;
    }

    public static String[] reverse(String[] array){

        String[] result = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--){
            result[j] = array[i];
        }

        return result;
    }

    public static double[] reverse(double[] array){

        double[] result = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--){
            result[j] = array[i];
        }

        return result;
    }

    public static char[] reverse(char[] array){

        char[] result = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--){
            result[j] = array[i];
        }

        return result;
    }


}
