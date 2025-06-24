package com.example.thrid_boot.service;

import com.example.thrid_boot.dao.userMapper;
import org.apache.ibatis.annotations.Param;
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
    public boolean checkUserExists(String userName) {
        return userMapper.getPassword(userName) != null;
    }
    public void insertUser(@Param("userName") String userName, @Param("password") String password) {
        if(checkUserExists(userName)) {
            throw new IllegalArgumentException("User already exists");

         // 插入用户
         // 这里可以添加更多的逻辑，比如密码加密等
        }
        userMapper.insertUser(userName, password);
    }
}
