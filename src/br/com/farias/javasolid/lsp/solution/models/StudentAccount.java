package br.com.farias.javasolid.lsp.solution.models;

public class StudentAccount extends CommonAccount {

    public StudentAccount(double balance) {
        super(balance);
    }

    @Override
    public void applyInterest() {
        if (getBalance() > 10000) {
            setBalance(getBalance() * 1.02);
        }
    }
}
