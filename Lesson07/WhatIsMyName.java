package Lesson07;

import java.util.Scanner;

public class WhatIsMyName {
    public static void main (String[] args) {
        Scanner kbReader = new Scanner(System.in);

        System.out.print("What is your first name? ");

        String firstName = kbReader.nextLine();

        System.out.print("What is your last name? ");

        String lastName = kbReader.nextLine();

        System.out.println(STR."Your name is \{firstName} \{lastName}!");
    }
}
