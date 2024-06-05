package org.example;

public class ATM {
    private double balance;
    private double depositCash;
    private double withdrawCash;

    public ATM(){
    }

    public double getDepositCash() {
        return depositCash;
    }

    public void setDepositCash(double depositCash) {
        this.depositCash = depositCash;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawCash() {
        return withdrawCash;
    }

    public void setWithdrawCash(double withdrawCash) {
        this.withdrawCash = withdrawCash;
    }
}
