package day24_arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4};

        for (int j = 0; j <= arr.length - 1; j++){
            // check for 1 unique element
            int element = arr[j];
            int count = 0; // to store the frequency of the element
            // loop through array of elements
            for (int i = 0; i <= arr.length - 1; i++){
                //check if element already appears
                if (arr[i] == element){
                    // add to count
                    count++;
                }
            }

            if (count == 1){
                System.out.println(element);
            }
        }
    }
}
