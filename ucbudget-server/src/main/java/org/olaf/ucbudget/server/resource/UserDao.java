package org.olaf.ucbudget.server.resource;

import java.util.List;

import org.olaf.ucbudget.server.domain.User;


public interface UserDao {

    User findById(Integer id);

    List<User> findAll();

    User create(User user);
    Boolean delete(User user);



}
