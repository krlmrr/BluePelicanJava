package Lesson09;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println(STR."The integer \{num} is even.");
        } else {
            System.out.println(STR."The integer \{num} is odd.");
        }

        scan.close();
    }
}
