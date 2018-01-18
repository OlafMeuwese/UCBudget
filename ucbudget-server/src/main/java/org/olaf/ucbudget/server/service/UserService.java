package org.olaf.ucbudget.server.service;

import java.util.List;

import org.olaf.ucbudget.server.domain.User;

public interface UserService {

    User findById(Integer id);

    List<User> getAll();
}
