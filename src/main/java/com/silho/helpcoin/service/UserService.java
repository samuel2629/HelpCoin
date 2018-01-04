package com.silho.helpcoin.service;

import com.silho.helpcoin.model.UserHelpCoin;

public interface UserService {
    UserHelpCoin findById(Long id);
    void save(UserHelpCoin userHelpCoin);
    void delete(UserHelpCoin userHelpCoin);
}
