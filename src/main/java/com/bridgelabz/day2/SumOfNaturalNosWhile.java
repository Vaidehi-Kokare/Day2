package com.bridgelabz.day2;

import java.util.Scanner;

public class SumOfNaturalNosWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int i=1,sum=0;
        while (i<=5) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
