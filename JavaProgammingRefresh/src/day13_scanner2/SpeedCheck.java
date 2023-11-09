package day13_scanner2;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int speedLimit = 35;
        System.out.println("Enter your current speed");
        int currentSpeed = scan.nextInt();

        int overTheSpeedLimit = currentSpeed - speedLimit;

        System.out.println("currentSpeed = " + currentSpeed);

        if (overTheSpeedLimit > 0){
            System.out.println("You are driving " + overTheSpeedLimit + " miles over speed limit. Slow Down!");
        }
    }
}
