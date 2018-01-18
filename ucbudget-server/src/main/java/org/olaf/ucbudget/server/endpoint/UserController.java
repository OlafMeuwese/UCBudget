package org.olaf.ucbudget.server.endpoint;

import java.util.List;

import org.olaf.ucbudget.server.domain.User;
import org.olaf.ucbudget.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public User findById(@RequestParam(value = "id") String id){
        return userService.findById(Integer.valueOf(id));
    }

    @RequestMapping(value = "/list", method=RequestMethod.GET)
    public List<User> getAll(){
        return userService.getAll();
    }
}
