package com.silho.helpcoin.controller;

import com.silho.helpcoin.model.User;
import com.silho.helpcoin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.silho.helpcoin.constants.ConstantsUser.*;

@Controller
@SpringBootApplication
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/")
    public String home(){
        return "index";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String requestAddUser(@RequestParam(FIRST_NAME) String firstName,
                                 @RequestParam(LAST_NAME) String lastName,
                                 @RequestParam(EMAIL) String email,
                                 @RequestParam(PHONE) long phoneNumber){
        responseAddUser(firstName, lastName, email, phoneNumber);
        return "Adding User";
    }

    private void responseAddUser(String firstName, String lastName, String email, long phoneNumber) {
        User user = createUser(firstName, lastName, email, phoneNumber);
        userService.save(user);
    }

    private User createUser(String firstName, String lastName, String email, long phoneNumber) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPhone(phoneNumber);
        return user;
    }

}
