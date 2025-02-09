package day24_arrays;

public class ClassMates {
    public static void main(String[] args) {

        String[] myClassMates = {"Johnny", "Mikey", "Sharon", "Nikky"};
        for(int i = 0; i <= myClassMates.length - 1; i++){
            String firstThree = myClassMates[i].substring(0,3);
            System.out.println(firstThree);
        }

    }
}
