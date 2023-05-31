public class Factorial {

    public static int calcWithFor(int num) {
        int sum = 1;
        for (int i = sum + 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }

    public static int calcWithWhile(int num) {
        int sum = 1;
        int i = 2;
        while (i <= num) {
            sum *= i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calcWithFor(12));
        System.out.println(calcWithWhile(7));
    }
}
