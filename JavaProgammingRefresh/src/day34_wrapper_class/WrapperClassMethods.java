package day34_wrapper_class;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";
        int num = Integer.parseInt(str);
        int num2 = Integer.valueOf(str);

        System.out.println(num);
        System.out.println(num2);

        int num3 = Integer.parseInt(str);


    }
}
