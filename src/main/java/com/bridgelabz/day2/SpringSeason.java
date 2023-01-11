package com.bridgelabz.day2;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number");
        int m = scanner.nextInt();
        System.out.println("Enter day number");
        int d = scanner.nextInt();

        if((m==3) && (d>=20) && (d<=31))
            System.out.println("true");
        else
            if (m==6 && (d>=1) && (d<=30))
                System.out.println("true");
            else
                if(m>3 && d>=1 && d<=31)
                    System.out.println("true");
        System.out.println("false");
    }
}
