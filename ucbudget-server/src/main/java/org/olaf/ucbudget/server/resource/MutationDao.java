package org.olaf.ucbudget.server.resource;

import org.olaf.ucbudget.server.domain.Mutation;
import org.springframework.data.repository.CrudRepository;

public interface MutationDao extends CrudRepository<Mutation, Integer>{

}
