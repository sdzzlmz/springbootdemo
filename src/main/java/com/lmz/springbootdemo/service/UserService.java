package com.lmz.springbootdemo.service;

import com.lmz.springbootdemo.pojo.User;

import java.util.List;


/**
 * @Authour Triple6
 * @description:
 **/
public interface UserService {
    //新增用户
    boolean addUser(User user);
    //修改用户
    boolean updateUser(User user);
    //删除用户
    boolean deleteUser(int id);
    //根据用户名查询用户信息
    User findUserByName(String name);
    //查询所有用户
    List<User> findAll();
}
