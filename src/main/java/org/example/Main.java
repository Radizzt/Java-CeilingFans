package org.example;

import org.example.model.CeilingFan;

import java.util.Scanner;

/**
 * Main --- program to run a fan simulation that have 4 speeds 0-3
 * and the ability to go forward/reverse
 * @author Richard Huynh
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();
        Scanner myScanner = new Scanner(System.in);
        String userInput = "";

        //continually scan for user input until "Q" key is read
        while (!userInput.equals("Q")){
            fan.displayCurSetting();
            System.out.println("Press Q to quit, S to pull the speed cord, R to pull the reverse cord.");
            userInput = myScanner.nextLine().toString().toUpperCase();
            switch(userInput){
                case "S":
                    System.out.println("Pulling Speed Cord.");
                    fan.pullSpeedCord();
                    break;
                case "R":
                    System.out.println("Pulling Reverse Cord.");
                    fan.pullReverseCord();
                    break;
                case "Q":
                    System.out.println("Goodbye...");
                    break;
                default:
                    System.out.println("Invalid Input.");
                    break;
            }
        }
        myScanner.close();
    }
}