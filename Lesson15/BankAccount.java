package Lesson15;

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(double bal, String accountName)
    {
        balance = bal;
        name = accountName;
    }

    public double deposit(double deposit)
    {
        balance =  balance + deposit;
        return balance;
    }

    public double withdraw(double withdraw)
    {
        balance =  balance - withdraw;
        return balance;
    }
}
