package day27_recap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {

        String str = "aaabcccddefggggh";

//        for (char each : str.toCharArray()){
//            System.out.println(each);
//        }

        for (char each : str.toCharArray()){
            if (str.indexOf(each) == str.lastIndexOf(each)){
                System.out.println(each);
            }
        }
    }
}
