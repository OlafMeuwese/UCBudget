package org.olaf.ucbudget.server.service.impl;

import org.olaf.ucbudget.server.domain.Account;
import org.olaf.ucbudget.server.resource.AccountDao;
import org.olaf.ucbudget.server.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public Account save(Account account) {
        return accountDao.save(account);
    }
}
