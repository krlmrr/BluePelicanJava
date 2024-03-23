package Lesson11;

import java.util.Scanner;

public class NameReversal {
    public static void main(String[] arg) {
        System.out.print("Please, enter your name : ");

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine().toLowerCase();

        for(int i = name.length() - 1; i >= 0; i--)
        {
            System.out.print(name.charAt(i));
        }
    }
}
