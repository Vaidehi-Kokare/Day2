package com.bridgelabz.day2;

import java.util.Scanner;

public class RevNoFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int rev=0, unit;
        for (int i = n; i !=0; i=i/10){
            unit = i % 10;
            rev = rev*10+unit;
        }
        System.out.println(n + " reversed is " + rev);
    }
}
