package com.silho.helpcoin.service;

import com.silho.helpcoin.dao.UserDao;
import com.silho.helpcoin.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(User user) {

    }
}
