package org.example;

public class Intermediate {
    public static String getNumString(int number) {
        String[] numStrings = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        if (number > 10) {
            return "Number-range: 1-10";
        }
        return numStrings[number - 1];
    }

    public static void printNumsMod3Mod5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("#" + i);
            }
            if (i % 5 == 0) {
                System.out.println("$" + i);
            }
            else {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {

    }
}
