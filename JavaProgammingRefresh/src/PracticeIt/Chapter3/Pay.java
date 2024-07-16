package PracticeIt.Chapter3;

public class Pay {
    public static void main(String[] args) {

        System.out.println(pay(5.50, 6));
        System.out.println(pay(4.00, 11));
    }
    public static double pay(double salary, int hoursWorked){

        if (hoursWorked > 8){
            return salary * hoursWorked + (hoursWorked - 8) * 0.5 * salary;
        }else {
            return salary * hoursWorked;
        }
    }
}
