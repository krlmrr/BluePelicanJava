package Lesson15;

import java.util.Scanner;

public class OverdrawnAtTheBank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your name? ");

        String name = scan.nextLine();

        System.out.print("What is your balance? ");

        double balance = scan.nextDouble();

        BankAccount account = new BankAccount(balance, name);

        account.deposit(505.22);

        System.out.println(account.balance);

        account.withdraw(100);

        System.out.println(STR."The \{name} account balance is \{account.balance}");

        scan.close();
    }
}
