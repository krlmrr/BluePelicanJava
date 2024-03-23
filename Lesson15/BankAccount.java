package Lesson15;

public class BankAccount {
    public double balance;
    public String name;

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
