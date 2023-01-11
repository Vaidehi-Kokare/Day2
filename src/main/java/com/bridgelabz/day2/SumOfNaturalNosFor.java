package com.bridgelabz.day2;

import java.util.Scanner;

public class SumOfNaturalNosFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int sum=0;
        for (int i=1; i<=5; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
