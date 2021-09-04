/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Nicholas Smarsh
 */
package org.example;
import java.util.Scanner;

public class assignment5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the first number");
        String firstNum = scan.nextLine();

        System.out.println("What is the second number");
        String secondNum = scan.nextLine();

        //covert first and second num into numbers
        int firstNumInt = Integer.parseInt(firstNum);
        int secondNumInt = Integer.parseInt(secondNum);

        //do the math
        int addition = firstNumInt + secondNumInt;
        int subtraction = firstNumInt - secondNumInt;
        int multiplication = firstNumInt * secondNumInt;
        int division = firstNumInt / secondNumInt;

        System.out.println(firstNum + " + " + secondNum + " = " + addition);
        System.out.println(firstNum + " - " + secondNum + " = " + subtraction);
        System.out.println(firstNum + " * " + secondNum + " = " + multiplication);
        System.out.println(firstNum + " / " + secondNum + " = " + division);

    }
}
