package Fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class Exercises_3 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter the height of the rectangle: ");
        double heigh = scanner.nextDouble();

        System.out.println("Enter the base of the rectangle: ");
        double base = scanner.nextDouble();
        double area = heigh * base;
        System.out.println("The area of the rectangle is :");
        System.out.println(area);



    }
}
