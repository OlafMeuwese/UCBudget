package org.olaf.ucbudget.server.service;

import org.olaf.ucbudget.server.domain.User;

public interface UserService {

    User findById(Long id);
}
