package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Methods {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static String sumString(int a, int b) {
        return String.format("Summe: %d", a + b);
    }

    public static boolean gt100(int a, int b) {
        return (a > 100 || b > 100);
    }

    public static boolean smallerThanZero(int a) {
        return (a < 0);
    }

    public static int sumSquareOrSubstract(int a, int b, boolean subtract) {
        if (subtract) {
            return b - a;
        }
        if (a > b) {
            return a + b;
        }
        else {
            return a * b;
        }
    }

    public static void inputSum() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter number 1:");
            int a = scanner.nextInt();
            System.out.println("Enter number 2:");
            int b = scanner.nextInt();
            System.out.printf("%d + %d = %d%n", a, b, a + b);
        } catch (InputMismatchException e) {
            System.out.println("Input has to be integer!");
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sumString(4, 5));
        System.out.println("Is greater than 100? " + gt100(42, 255));
        inputSum();
    }
}
