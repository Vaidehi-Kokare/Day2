package com.bridgelabz.day2;

import java.util.Scanner;

public class RevNoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int temp = n;
        int rev=0, unit;
        while(temp!=0){
            unit = temp % 10;
            rev = rev*10+unit;
            temp = temp / 10;
        }
        System.out.println(n + " reversed is " + rev);
    }
}
