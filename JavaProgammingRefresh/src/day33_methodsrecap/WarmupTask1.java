package day33_methodsrecap;

public class WarmupTask1 {


    public static int[] reverse(int[] array){

        int[] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--){
            result[j] = array[i];
        }

        return result;
    }
}
