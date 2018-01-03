package com.silho.helpcoin.service;

import com.silho.helpcoin.model.User;

public interface UserService {
    User findById(Long id);
    void save(User user);
    void delete(User user);
}
