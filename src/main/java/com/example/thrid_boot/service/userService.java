package com.example.thrid_boot.service;

import com.example.thrid_boot.dao.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
    @Autowired
    userMapper userMapper;
    /**
     * 获取用户密码
     * @param userName 用户名
     * @return 密码
     */
    public String getPassword(String userName) {
        return userMapper.getPassword(userName);}
}
