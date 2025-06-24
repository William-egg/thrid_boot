package com.example.thrid_boot.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface userMapper {
    @Select("SELECT password FROM userinfo WHERE userName = #{userName}")
    public String getPassword(@Param("userName") String userName);

    @Insert("INSERT INTO userinfo (userName, password) VALUES (#{userName}, #{password})")
    public void insertUser(@Param("userName") String userName, @Param("password") String password);
}
