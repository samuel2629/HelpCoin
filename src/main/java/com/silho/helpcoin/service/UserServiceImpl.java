package com.silho.helpcoin.service;

import com.silho.helpcoin.dao.UserDao;
import com.silho.helpcoin.model.UserHelpCoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserHelpCoin> findAllUserHelpCoin() {
        return userDao.findAllUserHelpCoin();
    }

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
