package Lesson10;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] arg) {
        System.out.println("Make your arithmetic selection from the choices below: ");

        System.out.println("  Add");
        System.out.println("  Subtract");
        System.out.println("  Multiply");
        System.out.println("  Divide");

        Scanner scan = new Scanner(System.in);

        String choice = scan.nextLine();

        System.out.print("What is your first number? ");
        double num1 = scan.nextDouble();

        System.out.print("What is your second number? ");
        double num2 = scan.nextDouble();

        System.out.println(choice.toUpperCase());

        switch (choice.toLowerCase()) {
            case "add":
                System.out.println(STR."\{num1} plus \{num2} = \{num1 + num2}");
                break;
            case "subtract":
                System.out.println(STR."\{num1} minus \{num2} = \{num1 - num2}");
                break;
            case "multiply":
                System.out.println(STR."\{num1} times \{num2} = \{num1 * num2}");
                break;
            case "divide":
                System.out.println(STR."\{num1} divided by \{num2} = \{num1 / num2}");
                break;
            default:
                System.out.println("I don't know what you mean... ");
        }
    }
}
