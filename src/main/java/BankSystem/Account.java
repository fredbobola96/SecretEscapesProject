package BankSystem;

import java.util.ArrayList;

public class Account
{
    private final String name;
    private double balance;
    private final String emailAddress;

    public Account(String name, double balance, String emailAddress)
    {
        this.name = name;
        this.balance = balance;
        this.emailAddress = emailAddress;
    }

    //return current account balance
    public double getBalance()
    {
        return this.balance;
    }

    //return account name
    public String getName()
    {
        return this.name;
    }

    //return account email address
    public String getEmailAddress()
    {
        return this.emailAddress;
    }

    //Return String of account details
    public  String getDetails()
    {
        return "Name: " + name + " Email address: " + emailAddress + " Balance: £" + balance;
    }

    //name = person receiving money
    //this = person sending the money
    public void transferFunds(Account name, double amount)
    {
        if (this.balance >= amount)
        {
            name.balance += amount;
            this.balance -= amount;
            System.out.println("Transaction Successful! " + this.getName() + "'s balance is now: £" + this.balance);
            System.out.println((name.getName() + " has received £" + amount));
        }

        else
        {
            System.err.println("Transaction Unsuccessful! " + this.getName()+ " has Insufficient Funds!");
        }
        System.exit(0);
    }

    public static void accountsList()
    {
        Account Ben = new Account("Ben", 200.0, "ben10@example.com");
        Account Fred = new Account("Fred", 200.0, "bedheadfred@example.com");
        Account Eric = new Account("Eric", 200.0, "ericStrange@example.com");
        Account John = new Account("John", 200.0, "johndoe@example.com");
        Account Chris = new Account("Chris", 200.0, "chrisjones@example.com");

        ArrayList<String> userDetails = new ArrayList<>(5);
        userDetails.add(Ben.getDetails());
        userDetails.add(Fred.getDetails());
        userDetails.add(Eric.getDetails());
        userDetails.add(John.getDetails());
        userDetails.add(Chris.getDetails());

        for (String userDetail : userDetails)
        {
            System.out.println(userDetail);
        }
    }
}
