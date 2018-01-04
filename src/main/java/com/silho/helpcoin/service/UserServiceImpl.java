package com.silho.helpcoin.service;

import com.silho.helpcoin.dao.UserDao;
import com.silho.helpcoin.model.UserHelpCoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserHelpCoin findById(Long id) {
        return null;
    }

    @Override
    public void save(UserHelpCoin userHelpCoin) {
        userDao.save(userHelpCoin);
    }

    @Override
    public void delete(UserHelpCoin userHelpCoin) {

    }
}
