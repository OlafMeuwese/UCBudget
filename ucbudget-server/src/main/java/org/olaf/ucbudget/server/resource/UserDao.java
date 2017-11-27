package org.olaf.ucbudget.server.resource;

import java.util.List;

import org.olaf.ucbudget.server.domain.User;


public interface UserDao {

    User findById(Long id);

    List<User> findAll();

    User create(User user);
    User update(User user);
    Boolean delete(User user);



}
