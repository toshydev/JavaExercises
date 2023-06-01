package org.example;

public class Expert {
    public static void reversePrintString(String text) {
        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        System.out.println(reverse);
    }

    public static String[] stringToArray(String text) {
        return text.split(",");
    }

    public static int crossSum(int number) {
        int digit, sum = 0;
        while (number > 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static int crossSumRecursive(int number) {
        if (number == 0) {
            return number;
        }
        return number % 10 + crossSumRecursive(number / 10);
    }

    public static String toRoman(int number) {
        int[] arabic = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arabic.length; i++) {
            while (number >= arabic[i]) {
                result.append(roman[i]);
                number -= arabic[i];
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        reversePrintString("Toshy");
    }
}
