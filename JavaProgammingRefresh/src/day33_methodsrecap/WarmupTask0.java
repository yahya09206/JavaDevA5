package day33_methodsrecap;

public class WarmupTask0 {
    public static void main(String[] args) {

        // remove element at given index of the array
    }

    public static int[] remove(int[] array, int index) {

        if (index >= 0 && index <= array.length - 1) {

            System.err.println("Invalid index");
            return array;
        }

        int[] result = new int[array.length - 1];

        for (int i = 0, j = 0; i <= array.length - 1; i++){
            if (i == index){
                continue;
            }else {
                result[j++] = array[i];
            }
        }

        return result;
    }
}
