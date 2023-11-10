package day15_string;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = "Cybertek";
        String str2 = new String("Cybertek");

        System.out.println("-----------------------------------");

        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = "Cat";

        System.out.println(s1 == s3);


        System.out.println("-----------------------------------");

        String s4 = new String("Dog");
        String s5 = new String("Dog");
        System.out.println(s4 == s5);


    }
}
