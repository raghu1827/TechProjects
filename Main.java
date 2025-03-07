package BASM;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Bank Account Menu =====");
            System.out.println("1. Create New Account");
            System.out.println("2. Display Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scan.nextInt();
            scan.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNumber = scan.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String accHolder = scan.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = scan.nextDouble();

                    accounts.add(new BankAccount(accNumber, accHolder, balance));
                    System.out.println(" Account created successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String accNumDisplay = scan.nextLine();
                    BankAccount accToDisplay = findAccount(accNumDisplay, accounts);
                    if (accToDisplay != null) {
                        accToDisplay.displayAccount();
                    } else {
                        System.out.println(" Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    String accNumDeposit = scan.nextLine();
                    BankAccount accToDeposit = findAccount(accNumDeposit, accounts);
                    if (accToDeposit != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scan.nextDouble();
                        accToDeposit.deposit(depositAmount);
                    } else {
                        System.out.println(" Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    String accNumWithdraw = scan.nextLine();
                    BankAccount accToWithdraw = findAccount(accNumWithdraw, accounts);
                    if (accToWithdraw != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scan.nextDouble();
                        accToWithdraw.withdraw(withdrawAmount);
                    } else {
                        System.out.println(" Account not found!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    scan.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    // Find an account by account number
    private static BankAccount findAccount(String accNumber, ArrayList<BankAccount> accounts) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accNumber)) {
                return acc;
            }
        }
        return null;
    }
}
