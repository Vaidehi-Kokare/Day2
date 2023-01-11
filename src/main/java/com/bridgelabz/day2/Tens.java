package com.bridgelabz.day2;

import java.util.Scanner;

public class Tens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a power of 10");
        int n = scanner.nextInt();
        if(n%10==0)
            System.out.println("Enter valid number");
        else
            if (n==1)
                System.out.println("unit");
            else
                if (n==10)
                    System.out.println("Ten");
                else
                    if (n==100)
                        System.out.println("Hundred");
                    else
                        System.out.println("Thousand");
    }
}
