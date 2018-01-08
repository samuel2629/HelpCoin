package com.silho.helpcoin.dao;

import com.silho.helpcoin.model.UserHelpCoin;

import java.util.List;


public interface UserDao {
    List<UserHelpCoin> findAllUserHelpCoin();
    UserHelpCoin findById(Long id);
    void save(UserHelpCoin userHelpCoin);
    void delete(UserHelpCoin userHelpCoin);
}
