package org.olaf.ucbudget.server.endpoint;

import org.olaf.ucbudget.server.domain.Bank;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bank", path = "bank")
public interface BankController extends PagingAndSortingRepository<Bank, Integer>{
}