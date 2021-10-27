package BankSystem;

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
        return balance;
    }

    //return account name
    public String getName()
    {
        return this.name;
    }

    //return account email address
    public String getEmailAddress()
    {
        return emailAddress;
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
            System.out.println(this.getName() + " 's balance is £" + this.getBalance());
        }
    }
}
