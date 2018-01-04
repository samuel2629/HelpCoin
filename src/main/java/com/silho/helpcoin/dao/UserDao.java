package com.silho.helpcoin.dao;

import com.silho.helpcoin.model.UserHelpCoin;


public interface UserDao {
    UserHelpCoin findById(Long id);
    void save(UserHelpCoin userHelpCoin);
    void delete(UserHelpCoin userHelpCoin);
}
