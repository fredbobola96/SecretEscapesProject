package BankSystem;

import java.util.Scanner;

public class MainBank
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the bank");
        System.out.println("Select desired function: 1)View Accounts 2)Transfer Funds 3) Exit system");

        Scanner scan = new Scanner(System.in);
        String userSelection = scan.nextLine();

        //Accounts List Component
        switch (userSelection)
        {
            case "1":
                Account.accountsList();
                break;

            //Transaction Component
            case "2":
                System.out.println("Enter account to send money from: Ben, Fred, Eric, John, Chris");
                String selectedSender = scan.next();

                System.out.println("Enter account to send money to: Ben, Fred, Eric, John, Chris");
                String selectedReceiver = scan.next();

                System.out.println("Enter amount of money to send: ");
                Double selectedAmount = scan.nextDouble();

                AccountTransferLogic accountTransfer = new AccountTransferLogic();
                accountTransfer.performLogic(selectedSender, selectedReceiver, selectedAmount);
                break;

            //Terminate app
            case "3":
                System.out.println("Bye!");
                System.exit(0);
        }
    }
}