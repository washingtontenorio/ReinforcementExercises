package ConditionalStructure;

import java.util.Scanner;

public class SwitchCase2 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Enter for number from 1 to 7: ");
        var option = scanner.nextInt();
        switch (option){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid option");

        }
    }
}
