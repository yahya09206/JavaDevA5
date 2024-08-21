package day34_wrapper_class;

public class WrapperClassIntro {
    public static void main(String[] args) {

        short s = 10;
        int num = s;
        Integer num2 = (int) s; // Autoboxing: converting primitive value to a wrapper class value

        char ch = '@';
        Character ch2 = (Character) ch;

        Byte b1 = 10;
        byte b2 = b1;
        short b3 = b1;
        int b4 = b1;
    }
}
