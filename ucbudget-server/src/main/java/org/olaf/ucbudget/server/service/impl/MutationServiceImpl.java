package org.olaf.ucbudget.server.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.olaf.ucbudget.server.domain.Mutation;
import org.olaf.ucbudget.server.resource.MutationDao;
import org.olaf.ucbudget.server.service.MutationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MutationServiceImpl implements MutationService{

    private MutationDao mutationDao;

    @Autowired
    public MutationServiceImpl(MutationDao mutationDao) {
        this.mutationDao = mutationDao;
    }

    @Override
    public List<Mutation> getAllMutationsByAccountId(Integer accountId) {
        return StreamSupport.stream(mutationDao.findAll().spliterator(), false)
                     .filter(mutation -> isOfAccount(mutation, accountId))
                     .collect(Collectors.toList());
    }

    private boolean isOfAccount(Mutation mutation, Integer accountId) {
        return mutation.getAccount().getId().equals(accountId);
    }


    @Override
    public List<Mutation> getAll() {
        List<Mutation> result =  new ArrayList<>();
        mutationDao.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Mutation getMutationById(Integer id) {
        return mutationDao.findOne(id);
    }

    @Override
    public Mutation save(Mutation mutation) {
        return mutationDao.save(mutation);
    }


}
