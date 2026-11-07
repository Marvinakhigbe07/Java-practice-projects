package org.example;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String name;
        double account_balance = 0;
        double deposit_money = 0;
        double withdraw_money = 0;
        int choice = 0;

        System.out.print("Enter your name: ");
        name = scanner.nextLine().toUpperCase();

        {
            account_balance = random.nextDouble(10000, 100001);
            System.out.printf("%.2f\n", account_balance);

            while (choice != 5) {
                System.out.println("Welcome, " + name);
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. withdraw Money");
                System.out.println("4. Account Information");
                System.out.println("5. Exit");

                System.out.print("Select: ");
                choice = scanner.nextInt();


                switch (choice) {
                    case 1 -> {
                        System.out.printf("Your account balance is: %.2f\n", account_balance);
                        String show_balance = account_balance > 20000 ? "Your balance is  above 20,000" : "Your balance is below 20,000";
                        System.out.println(show_balance);
                    }
                    case 2 -> {

                        System.out.println("How much would you like to deposit: ");
                        deposit_money = scanner.nextInt();
                        if (deposit_money > 0) {
                            account_balance = deposit_money + account_balance;
                            System.out.println("Your deposit of " + deposit_money + " was successful.");
                            System.out.printf("Your new balance is: %.2f\n", account_balance);
                        } else {
                            System.out.println("Deposit amount cannot be zero(0) or less");
                        }
                    }
                    case 3 -> {
                        System.out.println("How much would you like to withdraw: ");
                        withdraw_money = scanner.nextInt();
                        if (withdraw_money > 0 && withdraw_money <= account_balance) {
                            account_balance = account_balance - withdraw_money;
                            System.out.println("Your withdrawal of " + withdraw_money + " was successful.");
                            System.out.printf("Your new balance is: %.2f\n", account_balance);
                        } else {
                            System.out.println("Withdraw amount cannot be greater than your account balance! ");
                        }
                    }

                    case 4 -> {
                        System.out.println("Account Name: " + name);
                        System.out.println("Bank Name: GTB Bank");
                        System.out.println("Account Number: 894***6574");
                    }
                    case 5 -> System.out.println("Exited Successfully");

                    default -> System.out.println("Invalid input!");

                }


//
            }

            scanner.close();
        }
        }
    }
