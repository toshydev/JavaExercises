public class Fizzbuzz {
    public static String fizzbuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "fizzbuzz";
        }
        if (!(num % 3 == 0 && num % 5 == 0)) {
            return "fizzbuzz";
        }

        return "";
    }
}
