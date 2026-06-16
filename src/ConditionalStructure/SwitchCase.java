package ConditionalStructure;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter for number from 1 to 7: ");
        var option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Sartuday");
                break;
            default:
                System.out.println("invalid option");
        }
    }
}
