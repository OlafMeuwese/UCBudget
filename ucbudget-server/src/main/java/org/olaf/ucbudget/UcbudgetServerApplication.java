package org.olaf.ucbudget;

import java.math.BigDecimal;
import java.util.Date;

import org.olaf.ucbudget.server.domain.Account;
import org.olaf.ucbudget.server.domain.Bank;
import org.olaf.ucbudget.server.domain.Mutation;
import org.olaf.ucbudget.server.domain.User;
import org.olaf.ucbudget.server.endpoint.BankController;
import org.olaf.ucbudget.server.service.AccountService;
import org.olaf.ucbudget.server.service.MutationService;
import org.olaf.ucbudget.server.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UcbudgetServerApplication implements CommandLineRunner {

    private MutationService mutationService;
    private AccountService accountService;
    private UserService userService;
    private BankController bankController;

    public UcbudgetServerApplication(MutationService mutationService,
                                     AccountService accountService,
                                     UserService userService,
                                     BankController bankController) {
        this.mutationService = mutationService;
        this.accountService = accountService;
        this.userService = userService;
        this.bankController = bankController;
    }

    public static void main(String[] args) {
        SpringApplication.run(UcbudgetServerApplication.class, args);

    }

    @Override
    public void run(String... args) {
        User user = userService.save(new User("JDoe", "John", "Doe",
                                         "john_doe@example.com", "hello"));

        Bank bank = bankController.save(new Bank("Golden Bank"));

        Account account = accountService.save(new Account(user, bank, "NL12BANK3456789", "Savings"));

        Mutation mutation1 = new Mutation(account, "dr", "donate", new BigDecimal(10), new Date(),
                                         "Jane", "NL09BANK87654321",
                                         "First deposit");
        Mutation mutation2 = new Mutation(account, "dr", "donate", new BigDecimal(15), new Date(),
                                         "Jane", "NL09BANK87654321",
                                         "Second deposit");
        Mutation mutation3 = new Mutation(account, "dr", "donate", new BigDecimal(20), new Date(),
                                         "Jane", "NL09BANK87654321",
                                         "Third deposit");
        Mutation mutation4 = new Mutation(account, "dr", "donate", new BigDecimal(25), new Date(),
                                         "Jane", "NL09BANK87654321",
                                         "Fourth deposit");

        mutationService.save(mutation1);
        mutationService.save(mutation2);
        mutationService.save(mutation3);
        mutationService.save(mutation4);
    }
}
