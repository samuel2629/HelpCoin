package com.silho.helpcoin.controller;

import com.silho.helpcoin.model.UserHelpCoin;
import com.silho.helpcoin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.silho.helpcoin.constants.ConstantsUser.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/")
    public String home(){
        UserHelpCoin userHelpCoin = createUser((int) System.currentTimeMillis(),"Louis", "zaffran", "samuel2629@gmail.com", 7699954);
        userService.save(userHelpCoin);
        return userService.findAllUserHelpCoin().get(3).getFirstName();
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String requestAddUser(@RequestParam(FIRST_NAME) String firstName,
                                 @RequestParam(LAST_NAME) String lastName,
                                 @RequestParam(EMAIL) String email,
                                 @RequestParam(PHONE) long phoneNumber){
        responseAddUser(firstName, lastName, email, phoneNumber);
        return "Adding UserHelpCoin";
    }

    private void responseAddUser(String firstName, String lastName, String email, long phoneNumber) {
        UserHelpCoin userHelpCoin = createUser((int) System.currentTimeMillis(), firstName, lastName, email, phoneNumber);
        userService.save(userHelpCoin);
    }

    private UserHelpCoin createUser(int i, String firstName, String lastName, String email, long phoneNumber) {
        UserHelpCoin userHelpCoin = new UserHelpCoin();
        userHelpCoin.setFirstName(firstName);
        userHelpCoin.setLastName(lastName);
        userHelpCoin.setEmail(email);
        userHelpCoin.setPhone(phoneNumber);
        userHelpCoin.setId(i);
        return userHelpCoin;
    }

}
