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

    public double getBalance()
    {
        return balance;
    }

    public String getName()
    {
        return this.name;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public  String getDetails()
    {
        return name + " " + "  Email address: " + emailAddress + " Balance: £" + balance;
    }

    public double withdraw(double amount)
    {
        if (getBalance() > 0 && getBalance() > amount)
        {
            balance = getBalance() - amount;
        } else
        {
            System.out.println("Insufficient Funds");
        }
        return balance;
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
