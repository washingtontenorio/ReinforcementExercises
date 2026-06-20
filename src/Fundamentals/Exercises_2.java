package Fundamentals;

import java.util.Scanner;

public class Exercises_2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        double area = side * side;

        System.out.printf("The area of the square is: %.2f%n", area);

        scanner.close();
    }
}