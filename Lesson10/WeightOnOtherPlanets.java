package Lesson10;

import java.util.Scanner;

public class WeightOnOtherPlanets {
    public static void main (String[] args) {
        System.out.print("What is your weight on Earth? ");

        Scanner scan = new Scanner(System.in);

        int weight = scan.nextInt();

        System.out.println("1. Voltar");
        System.out.println("2. Krypton");
        System.out.println("3. Fertos");
        System.out.println("4. Servontos");

        System.out.print("Selection? ");

        int selection = scan.nextInt();

        switch (selection) {
            case 1:
                System.out.println(STR."Your weight on Voltar would be \{weight * 0.091}");
                break;
            case 2:
                System.out.println(STR."Your weight on Krypton would be \{weight * 0.720}");
                break;
            case 3:
                System.out.println(STR."Your weight on Fertos would be \{weight * 0.865}");
                break;
            case 4:
                System.out.println(STR."Your weight on Servontos would be \{weight * 4.612}");
                break;
            default:
                System.out.println("I don't understand your selection...");
        }

    }
}
