package day23_arrays;

public class MyClassMates {
    public static void main(String[] args) {

        // declares like this for when you know how many items
        String[] classmates = new String[5];

        for (int i = 0; i <= classmates.length - 1; i++){
            System.out.println(classmates[i]);
        }

        classmates[0] = "Jamal";
        classmates[1] = "Jaime";
        classmates[2] = "Jessica";
        classmates[3] = "Wendy";
        classmates[4] = "Akbar";
    }
}
