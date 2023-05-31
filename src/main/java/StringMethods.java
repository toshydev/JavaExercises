public class StringMethods {
    public static boolean longerThan20(String string) {
        return string.length() > 20;
    }

    public static boolean containsFancy(String string) {
        return string.toLowerCase().contains("fancy");
    }

    public static void checkString(String string) {
        System.out.println("String: " + string);
        System.out.println("Has more than 20 characters: " + longerThan20(string));
        System.out.println("Contains the word 'fancy': " + containsFancy(string));
    }

    public static void main(String[] args) {
        checkString("ThisIs a FaNcystring I wanttoCHEck!");
    }
}
