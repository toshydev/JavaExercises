public class ControlFlow {
    public static String tooManyPeople(int count, String alarm) {
        int people_MAX = switch (alarm) {
            case "yellow" -> 30;
            case "green" -> 60;
            default -> 0;
        };
        if (count > people_MAX) {
            return "Too many people!";
        }
        else if (count == people_MAX) {
            return String.format("Just enough. In Store: %d, Allowed: %d%n", count, people_MAX);
        }
        else {
            return "Maximum count is not reached yet.";
        }
    }

    public static void main(String[] args) {
        System.out.println(tooManyPeople(60, "green"));
    }
}
