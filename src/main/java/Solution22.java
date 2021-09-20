/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Paul Kelly
 */

import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        //Check to see if all the number are different
        if (!(num1 == num2 && num2 == num3)) {
            //print the largest number of the three
            if ((num1-num2) > 0 && (num1-num3) > 0) {
                System.out.printf("The largest number is %d.\n", num1);
            }
            if ((num1-num2) < 0 && (num2-num3) > 0) {
                System.out.printf("The largest number is %d.\n", num2);
            }
            if ((num1-num3) < 0 && (num2-num3) < 0) {
                System.out.printf("The largest number is %d.\n", num3);
            }
        }
    }
}
