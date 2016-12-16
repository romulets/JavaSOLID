package br.com.farias.javasolid.lsp.solution.services;

import br.com.farias.javasolid.lsp.solution.models.CommonAccount;

import java.util.List;

public class AccountService {


    public void applyDailyInterests(List<CommonAccount> accounts) {
        double initialBalance;
        String message;

        for (CommonAccount account : accounts) {
            initialBalance = account.getBalance();
            account.applyInterest();

            /* Other stuff relative to apply interests */

            message = String.format("The balance was %.2f and now is %.2f", initialBalance, account.getBalance());
            System.out.println(message);
        }
    }

}
