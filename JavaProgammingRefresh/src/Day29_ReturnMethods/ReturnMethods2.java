package Day29_ReturnMethods;

public class ReturnMethods2 {
    public static void main(String[] args) {

        System.out.println("findMax(3, 4) = " + findMax(3, 4));
        System.out.println("findMax(3, 4) = " + findMax(323, 3));
        System.out.println("findMax(3, 4) = " + findMax(-32, -1000));

    }

    public static int findMax(int num1, int num2){

        int max = 0;

        if (num1 > num2){
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }
}
