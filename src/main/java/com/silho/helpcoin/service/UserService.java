package com.silho.helpcoin.service;

import com.silho.helpcoin.model.UserHelpCoin;

import java.util.List;

public interface UserService {
    List<UserHelpCoin> findAllUserHelpCoin();
    UserHelpCoin findById(Long id);
    void save(UserHelpCoin userHelpCoin);
    void delete(UserHelpCoin userHelpCoin);
}
