package day24_arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 6, 10, 10, 21};

        for (int j = 0; j <= arr.length - 1; j++){
            // get first element from array
            int element = arr[j];
            // keep track of frequency
            int count = 0;

            for (int i = 0; i <= arr.length - 1; i ++){
                if (arr[i] == element){
                    count++;
                }

            }
            if (count == 1){
                System.out.println(element + " ");
            }
        }
    }
}
