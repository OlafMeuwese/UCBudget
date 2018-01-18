package org.olaf.ucbudget.server.service.impl;

import java.util.List;

import org.olaf.ucbudget.server.domain.User;
import org.olaf.ucbudget.server.resource.UserDao;
import org.olaf.ucbudget.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }
}
