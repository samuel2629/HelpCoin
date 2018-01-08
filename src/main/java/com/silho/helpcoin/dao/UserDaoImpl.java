package com.silho.helpcoin.dao;

import com.silho.helpcoin.model.UserHelpCoin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public List<UserHelpCoin> findAllUserHelpCoin() {
        Session session = sessionFactory.openSession();
        List<UserHelpCoin> userHelpCoinList = session.createCriteria(UserHelpCoin.class).list();
        session.close();
        return userHelpCoinList;
    }

    @Override
    public UserHelpCoin findById(Long id) {
        Session session = sessionFactory.openSession();
        session.close();
        return null;
    }

    @Override
    @Transactional
    public void save(UserHelpCoin userHelpCoin) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(userHelpCoin);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void delete(UserHelpCoin userHelpCoin) {

    }
}
