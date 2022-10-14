package application;


import model.entities.Account;
import model.exceptions.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int numberAccount = sc.nextInt();

            System.out.print("Holder: ");
            String holderName = sc.next();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withrawLimit = sc.nextDouble();

            Account account = new Account(numberAccount, holderName, balance, withrawLimit);

            System.out.print("Enter amount dor withdraw: ");
            double withdraw = sc.nextDouble();

            account.withDraw(withdraw);

            System.out.print("New balance: " + account.getBalance());
        }
        catch (WithdrawException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }

}
