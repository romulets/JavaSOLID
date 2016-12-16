package br.com.farias.javasolid.lsp.problem.models;

public class StudentAccount extends CommonAccount {

    public StudentAccount(double balance) {
        super(balance);
    }

    @Override
    public void applyInterest() {
        if (getBalance() > 10000) {
            setBalance(getBalance() * 1.02);
        } else {
            throw new RuntimeException("No interest to apply in this account");
        }
    }
}
