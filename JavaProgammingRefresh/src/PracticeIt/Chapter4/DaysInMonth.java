package PracticeIt.Chapter4;

public class DaysInMonth {
    public static void main(String[] args) {


    }

    public static int daysInMonth(int month) {
        if (month == 2) {
            return 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

}
