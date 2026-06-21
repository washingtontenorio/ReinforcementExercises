package Fundamentals;

import java.util.Scanner;

public class Exercises_4 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Enter the first person is name: ");
        String name = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter the second person is name: ");
        String name1 = scanner.next();
        System.out.println("Enter your age: ");
        int age1 = scanner.nextInt();
        int differenceAge = age - age1;

        System.out.printf("%s and %s have a %s year age. " ,name,name1,differenceAge);



    }
}
