package br.com.farias.javasolid.lsp.problem.models;

public class CommonAccount {

    private double balance;

    public CommonAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void applyInterest() {
        if (balance > 10000d) {
            balance *= 1.05;
        } else {
            balance *= 1.1;
        }
    }
}
