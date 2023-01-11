package com.bridgelabz.day2;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        System.out.println("Quadratic equation is a*x*x+b*x+c=0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = scanner.nextInt();
        System.out.println("Enter b ");
        int b = scanner.nextInt();
        System.out.println("Enter c ");
        int c = scanner.nextInt();
        int D = b*b - 4 * a * c;
        double r1 = (-b + Math.pow(D,0.5)) / 2*a ;
        double r2 = (-b - Math.pow(D,0.5)) / 2*a;
        System.out.println("Roots of equation " + a + "*x*x+" + b + "*x+" + c + "=0 are" + r1 + " and " + r2);


    }
}
