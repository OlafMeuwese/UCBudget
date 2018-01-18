package org.olaf.ucbudget.server.service;

import java.util.List;

import org.olaf.ucbudget.server.domain.Mutation;

public interface MutationService {

    List<Mutation> getAllMutationsByAccountId(Integer accountId);

    List<Mutation> getAll();

    Mutation getMutationById(Integer id);
}
