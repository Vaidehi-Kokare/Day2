package com.bridgelabz.day2;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        String a = scanner.next();
        switch (a) {
            case "a":
                System.out.println(a + " is a vowel");
                break;
            case "e":
                System.out.println(a + " is a vowel");
                break;
            case "i":
                System.out.println(a + " is a vowel");
                break;
            case "o":
                System.out.println(a + " is a vowel");
                break;
            case "u":
                System.out.println(a + " is a vowel");
                break;
            default:
                System.out.println(a + " is a consonant");
        }
    }
}
