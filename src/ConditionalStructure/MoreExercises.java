package ConditionalStructure;

import java.util.Scanner;

public class MoreExercises {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Provide your name: ");
        var name = scanner.next();
        System.out.println("Provide your age: ");
        var age = scanner.nextInt();
        System.out.println("Are you emancipated? (y/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("y");

        if(age >= 18){
            System.out.printf("%s is %s years old, you can drive. \n",name, age);
        } else if (age >=16 && isEmancipated) {
            System.out.printf("%s Even though you are %s years old, you are emancipated and can drive.\n ", name,age);
        } else {
            System.out.printf("%s you can not drive ", name);
        }
    }
}
