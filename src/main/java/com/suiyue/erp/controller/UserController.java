package com.suiyue.erp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @RequestMapping(value="single", method = RequestMethod.GET)
    public String findUser(String userName) {
        System.out.println(userName);
        return "ERP";
    }


}
