package org.example;

import java.util.HashMap;
import java.util.Map;

public class ATM_Operation_Imp implements ATM_OperationsInterFace {
    ATM cash = new ATM();
    Map<Double, String> miniStatement = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Your Account Balance is :"+ cash.getBalance()+ "\n\n");
    }

    @Override
    public void depositAmount(double depositAmount) {
        if (depositAmount % 100 == 0) {
//            miniStatement.put(depositAmount, " deposited");
            System.out.println(depositAmount + "Cash Deposited successfully! ");
            cash.setBalance(cash.getBalance() + depositAmount);
            cash.setDepositCash(cash.getDepositCash() + depositAmount);
            viewBalance();
        } else {
            System.out.println("Please enter the amount in multipal of 100");
        }
    }

    @Override
    public void viewMiniStatement() {
        System.out.println("Account Statement for the recent activities");
        System.out.println("Total deposit amount :" + cash.getDepositCash());
        System.out.println("Total Withdraw Amount : " + cash.getWithdrawCash());
        System.out.println("Balance : " + cash.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 100 == 0) {
            if (withdrawAmount <= cash.getBalance()) {
//                miniStatement.put(withdrawAmount,"Cash withdrawn");
                System.out.println("Collect your cash :" + withdrawAmount);
                cash.setBalance(cash.getBalance() - withdrawAmount);

                cash.setWithdrawCash(cash.getWithdrawCash() + withdrawAmount);
                viewBalance();
            }else {
                System.out.println("Your account balance is low to withdraw "+withdrawAmount + "\n\n");
            }
        } else {
            System.out.println("Please enter the amount in multipal of 100 \n\n");
        }
    }
}
