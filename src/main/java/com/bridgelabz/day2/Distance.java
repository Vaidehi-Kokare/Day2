package com.bridgelabz.day2;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinate of x");
        int x = scanner.nextInt();
        System.out.println("Enter coordinate of y");
        int y = scanner.nextInt();
        double dis = Math.sqrt(x*x+y*y);
        System.out.println("Distance of point ("+ x + "," + y + ")" + " from origin is " + dis);
    }
}
