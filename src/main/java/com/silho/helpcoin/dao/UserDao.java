package com.silho.helpcoin.dao;

import com.silho.helpcoin.model.User;

public interface UserDao {
    User findById(Long id);
    void save(User user);
    void delete(User user);
}
