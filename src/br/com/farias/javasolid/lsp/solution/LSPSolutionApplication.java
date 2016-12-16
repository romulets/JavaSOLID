package br.com.farias.javasolid.lsp.solution;

import br.com.farias.javasolid.lsp.solution.models.CommonAccount;
import br.com.farias.javasolid.lsp.solution.models.StudentAccount;
import br.com.farias.javasolid.lsp.solution.services.AccountService;

import java.util.ArrayList;
import java.util.List;

public class LSPSolutionApplication {

    public static void main(String[] args) {
        List<CommonAccount> accounts = new ArrayList<>();
        AccountService service = new AccountService();

        accounts.add(new CommonAccount(6000d));
        accounts.add(new CommonAccount(20000d));
        accounts.add(new StudentAccount(20000d));
        accounts.add(new StudentAccount(1000d));

        service.applyDailyInterests(accounts);
    }

}
