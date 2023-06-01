package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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

    public static void wordCollector() {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        while (true) {
            for(String word : words) {
                System.out.println(word);
            }
            System.out.println("Enter a word or quit with [/q]:");
            String newWord = scanner.nextLine();
            words.add(newWord);
            if (newWord.equals("/q")) {
                break;
            }
        }

    }
    public static void main(String[] args) {
        //printNumsMod3Mod5();
        wordCollector();
    }
}
