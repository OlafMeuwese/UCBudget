package org.olaf.ucbudget.server.resource;

import org.olaf.ucbudget.server.domain.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountDao extends CrudRepository<Account, Integer> {

}
