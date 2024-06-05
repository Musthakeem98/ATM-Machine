package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ATM_Operation_Imp operations = new ATM_Operation_Imp();
        int accountNumber = 123;
        int pinNumber = 1234;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the ATM Machine");
        System.out.println("Enter your Account number :");
        int accountNum = input.nextInt();
        System.out.println("Enter the Pin Number ;");
        int pinNum = input.nextInt();
        while (true){
        if (accountNumber == accountNum && pinNum == pinNumber) {
            System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
            System.out.println("Select your Choice :");
            int choice = input.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("Your Balance is : ");
                    operations.viewBalance();
                    break;
                case 2 :
                    System.out.println("Enter amount to Withdraw: ");
                    double withdrawCash = input.nextInt();
                    operations.withdrawAmount(withdrawCash);
                    break;
                case 3:
                    System.out.println("Enter the amount to Deposit :");
                    double depositCash = input.nextInt();
                    operations.depositAmount(depositCash);
                    break;
                case 4:
                    operations.viewMiniStatement();
                    break;
                case 5:
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter correct choice");
                    break;
            }
        } else {
            System.out.println("Incorrect Atm Number or pin");
            System.exit(0);
        }
}

    }
}