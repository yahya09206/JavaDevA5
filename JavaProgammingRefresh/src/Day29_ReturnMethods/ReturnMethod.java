package Day29_ReturnMethods;

public class ReturnMethod {
    public static void main(String[] args) {

        reverse("java");
        System.out.println(isPalindrome("level"));
    }

    public static String reverse(String str){

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }

        System.out.println(result);
        return result;
    }

    public static boolean isPalindrome(String str){

        String word = reverse(str);
        boolean isTrue = false;

        isTrue = word.equalsIgnoreCase(str);

        return isTrue;
    }
}
