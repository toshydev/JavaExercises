package org.example;

import java.util.Scanner;

public class Novice {
    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printNameFiveTimes(String name) {
        String repeated = new String(new char[5]).replace("\0", name);
        System.out.println(repeated);
    }

    public static boolean isGtZero(int number) {
        return number > 0;
    }

    public static int square(int number) {
        return number*number;
    }

    public static void readAndGreet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello there, " + name + "!");
    }
    public static void main(String[] args) {
        readAndGreet();
    }
}
