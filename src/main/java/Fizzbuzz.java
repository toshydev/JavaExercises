package org.example.project;

public class Fizzbuzz {
    public static String fizzbuzz(int num) {
        String result = "";
        if (num % 3 == 0) {
            result += "fizz";
        }
        if (num % 5 == 0) {
            result += "buzz";
        }
        if (!(num % 3 == 0 || num % 5 == 0)) {
            result = Integer.toString(num);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fizzbuzz(15));
    }
}
