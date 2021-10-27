package BankSystem;

public class AccountTransferLogic
{

    Account Ben = new Account("Ben", 200.0, "ben10@example.com");
    Account Fred = new Account("Fred", 200.0, "bedheadfred@example.com");
    Account Eric = new Account("Eric", 200.0, "ericStrange@example.com");
    Account John = new Account("John", 200.0, "johndoe@example.com");
    Account Chris = new Account("Chris", 200.0, "chrisjones@example.com");

    public AccountTransferLogic()
    {}

    public void performLogic(String selectedSender, String selectedReceiver, Double selectedAmount)
    {
        if(selectedSender.equalsIgnoreCase(Ben.getName()) || selectedSender.equalsIgnoreCase(Fred.getName()) || selectedSender.equalsIgnoreCase(Eric.getName()) || selectedSender.equalsIgnoreCase(John.getName()) || selectedSender.equalsIgnoreCase(Chris.getName()))
        {
            if(selectedReceiver.equalsIgnoreCase(selectedSender))
            {
                System.err.println("Cannot send money to the same account");
                System.err.println("Transaction Unsuccessful! " + stringToAccount(selectedSender).getName()+ " has Insufficient Funds!");
                System.out.println(stringToAccount(selectedSender).getName() + "'s balance is £" + stringToAccount(selectedSender).getBalance());
                System.exit(0);
            }
            else
            {
                System.out.println("Sender and Receiver Selected: " + selectedSender + " is sending £" + selectedAmount + " to " + selectedReceiver);
                finalTransaction(selectedSender, selectedReceiver, selectedAmount);
            }
        }
    }

    public void finalTransaction(String sender, String receiver, double amount)
    {
        stringToAccount(sender).transferFunds(stringToAccount(receiver), amount);
    }

    public Account stringToAccount(String sender)
    {
        Account Ben;
        Account Fred;
        Account Eric;
        Account John;
        Account Chris;

        if (sender.equalsIgnoreCase("Ben"))
        {
            Ben = new Account("Ben", 200.0, "ben10@example.com");
            return Ben;
        }
        else if(sender.equalsIgnoreCase("Fred"))
        {
            Fred = new Account("Fred", 200.0, "bedheadfred@example.com");
            return Fred;
        }
        else if(sender.equalsIgnoreCase("Eric"))
        {
            Eric = new Account("Eric", 200.0, "ericStrange@example.com");
            return Eric;
        }
        else if(sender.equalsIgnoreCase("John"))
        {
            John = new Account("John", 200.0, "johndoe@example.com");
            return John;
        }
        else if(sender.equalsIgnoreCase("Chris"))
        {
            Chris = new Account("Chris", 200.0, "chrisjones@example.com");
            return Chris;
        }
        else
        {
            System.err.println("No account exists under this name");
            return null;
        }
    }
}
