public class Factorial {

    public static int factWithFor(int num) {
        int sum = 1;
        for (int i = sum + 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }

    public static int factWithWhile(int num) {
        int sum = 1;
        int i = 2;
        while (i <= num) {
            sum *= i;
            i++;
        }
        return sum;
    }

    public static int factRecursive(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factRecursive(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(factWithFor(12));
        System.out.println(factWithWhile(7));
        System.out.println(factRecursive(5));
    }
}
