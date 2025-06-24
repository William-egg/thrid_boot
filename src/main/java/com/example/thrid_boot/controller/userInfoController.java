package com.example.thrid_boot.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class userInfoController {
    @Autowired
    private com.example.thrid_boot.service.userService userService;
    @RequestMapping("getPs")
    @ResponseBody
    public String getPs(String userName) {
        String password = userService.getPassword(userName);
        return password != null ? password : "User not found";
    }
    @RequestMapping("insertUser")
    @ResponseBody
    public String insertUser(@Param("userName") String userName, @Param("password") String password) {
        try{
            userService.insertUser(userName, password);
        }catch (Exception e){
            return "Error inserting user: " + e.getMessage();
        }
        return "Success inserting user: " + userName;
    }
}
