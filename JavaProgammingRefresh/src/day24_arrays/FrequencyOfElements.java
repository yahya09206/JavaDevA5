package day24_arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4};


        int element = arr[0];
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++){
            if (arr[i] == element){
                count++;
            }
        }
    }
}
