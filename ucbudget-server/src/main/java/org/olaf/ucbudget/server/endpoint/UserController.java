package org.olaf.ucbudget.server.endpoint;

import org.olaf.ucbudget.server.domain.User;
import org.olaf.ucbudget.server.service.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    private UserDao userDao;



    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public User findById(@RequestParam(value = "id") String id){
        return userDao.findById(Long.valueOf(id));
    }
}
