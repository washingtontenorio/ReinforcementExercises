package ConditionalStructure;

import java.util.Scanner;

public class SwitchCase3 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Enter for number from 1 to 7:");
        var option = scanner.nextInt();
        var message = switch (option) {
            case 1, 7 -> {
                var day = option == 1 ? "Sunday" : "Saturday";
                yield String.format("Today is %s the weekend. ", day);
            }
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "Invalid Option";
        };

        System.out.println(message);
    }
}
