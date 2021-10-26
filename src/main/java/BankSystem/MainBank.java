package BankSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBank
{
    //Currently, executes a function and then terminates
    public static void main(String[] args)
    {
        System.out.println("Welcome to the bank");
        System.out.println("Select desired function: 1)View Accounts 2)Transfer Funds 3) Exit system");

        Account Ben = new Account("Ben", 200.0, "ben10@example.com");
        Account Fred = new Account("Fred", 200.0, "bedheadfred@example.com");
        Account Eric = new Account("Eric", 200.0, "ericStrange@example.com");
        Account John = new Account("John", 200.0, "johndoe@example.com");
        Account Chris = new Account("Chris", 200.0, "chrisjones@example.com");


        Scanner scan = new Scanner(System.in);
        String userSelection = scan.nextLine();
        boolean stop = false;

        do
        {
            //Accounts List Component
            if (userSelection.equals("1"))
            {
                ArrayList<String> userDetails = new ArrayList<>(5);
                userDetails.add(Ben.getDetails());
                userDetails.add(Fred.getDetails());
                userDetails.add(Eric.getDetails());
                userDetails.add(John.getDetails());
                userDetails.add(Chris.getDetails());

                for(int i = 0; i < userDetails.size(); i++)
                {
                    System.out.println(userDetails.get(i));
                }

                System.out.println("Do you wish to perform another task? Y/N");
                String continueTask = scan.nextLine();

                if(continueTask.equalsIgnoreCase("Y"))
                {
                    stop = false;

                }
                else
                {
                    stop = true;
                }
            }


            //Transaction Component
            else if (userSelection.equals("2"))
            {
                System.out.println("Enter account to send money from: Ben, Fred, Eric, John, Chris");
                String selectedSender = scan.next();

                System.out.println("Enter account to send money to: Ben, Fred, Eric, John, Chris");
                String selectedReceiver = scan.next();

                System.out.println("Enter amount of money to send: ");
                Double selectedAmount = scan.nextDouble();

                AccountTransferLogic accountTransfer = new AccountTransferLogic(selectedSender, selectedReceiver, selectedAmount);
                accountTransfer.performLogic(selectedSender, selectedReceiver, selectedAmount);
            }
            //Terminate app
            else if (userSelection.equals("3"))
            {
                stop = true;
                System.out.println("Bye!");
                System.exit(0);
            }
        } while (stop == false);
    }
}