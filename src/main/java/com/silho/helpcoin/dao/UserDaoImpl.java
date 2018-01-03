package com.silho.helpcoin.dao;

import com.silho.helpcoin.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User findById(Long id) {
        Session session = sessionFactory.openSession();
        session.close();
        return null;
    }

    @Override
    public void save(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void delete(User user) {

    }
}
