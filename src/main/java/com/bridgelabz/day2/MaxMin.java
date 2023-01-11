package com.bridgelabz.day2;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter first number:");
        int a = scn.nextInt();

        System.out.println("Enter second number:");
        int b = scn.nextInt();

        System.out.println("Enter third number:");
        int c = scn.nextInt();

        int num1 = a + b * c;
        int num2 = c + a / b;
        int num3 = a % b + c;
        int num4 = a * b + c;


        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        if (num1 >= num2 && num1 >= num3 && num1 >= num4)
            System.out.println("a+b*c" + " is the max");
        else if (num2 >= num1 && num2 >= num3 && num2 >= num4)
            System.out.println("c+a/b" + " is the max");
        else if (num3 >= num1 && num3 >= num2 && num3 >= num4)
            System.out.println("a%b+c" + " is the max");
        else
            System.out.println("a*b+c" + " is the max");

        if (num1 <= num2 && num1 <= num3 && num1 <= num4)
            System.out.println("a+b*c" + " is the min");
        else if (num2 <= num1 && num2 <= num3 && num2 <= num4)
            System.out.println("c+a/b" + " is the min");
        else if (num3 <= num1 && num3 <= num2 && num3 <= num4)
            System.out.println("a%b+c" + " is the min");
        else
            System.out.println("a*b+c" + " is the min");

    }
}
