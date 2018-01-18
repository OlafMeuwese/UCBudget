package org.olaf.ucbudget.server.resource.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.olaf.ucbudget.server.domain.User;
import org.olaf.ucbudget.server.resource.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
    private SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public User findById(Integer id) {
        Session session =  sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

    @Override
    public List<User> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(User.class).list();

    }

    @Override
    public User create(User user) {
        return (User) sessionFactory.getCurrentSession().save(user);
    }


    @Override
    public Boolean delete(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
        return session.get(User.class, user.getId()) == null;
    }
}
