package PracticeIt.Chapter4;

public class Season {
    public static void main(String[] args) {


    }
    public static String season(int month, int day) {
        int days = (month - 1) * 31 + day;
        if (days >= 78 && days <= 170) {
            return "Spring";
        } else if (days >= 171 && days <= 263) {
            return "Summer";
        } else if (days >= 264 && days <= 356) {
            return "Fall";
        } else {
            return "Winter";
        }
    }
}
