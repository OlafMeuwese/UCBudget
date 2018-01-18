package org.olaf.ucbudget.server.endpoint;

import java.util.List;

import org.olaf.ucbudget.server.domain.Mutation;
import org.olaf.ucbudget.server.service.MutationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/mutation")
public class MutationController {
    private MutationService mutationService;

    @Autowired
    public MutationController(MutationService mutationService) {
        this.mutationService = mutationService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Mutation findById(@PathVariable(value = "id") Integer id){
        return mutationService.getMutationById(id);
    }

    @RequestMapping(value = "/getByAccountId", method = RequestMethod.GET)
    public List<Mutation> getByAccountId(@RequestParam(value = "id") Integer accountId){
        return mutationService.getAllMutationsByAccountId(accountId);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Mutation> getAll(){
        return mutationService.getAll();
    }
}
