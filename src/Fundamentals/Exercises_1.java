package Fundamentals;

import java.util.Scanner;

public class Exercises_1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String name;
        do {
            System.out.println("hello, whats your name? ");
            name = scanner.nextLine();
            if (!name.matches("[a-zA-ZÀ-ÿ ]+")) {
                System.out.println("Please, enter only letters!");
            }

        } while (!name.matches("[a-zA-ZÀ-ÿ]+"));



            System.out.println("whats your age old?");
            var age = scanner.nextInt();


            System.out.printf("Cool, your name is %s is your has %s age old ", name, age);
        scanner.close();

    }
}
