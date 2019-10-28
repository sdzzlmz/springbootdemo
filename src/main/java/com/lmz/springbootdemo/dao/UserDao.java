package com.lmz.springbootdemo.dao;

import com.lmz.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Authour Triple6
 * @description:
 **/
@Mapper
public interface UserDao {
    //新增用户数据
    @Insert("insert into t_user(id, name,age) values (#{id},#{name},#{age})")
    void addUser(User user);
    //修改用户数据
    @Update("update t_user set name=#{name},age=#{age} where id=#{id}")
    void updateUser(User user);
    //删除用户数据
    @Delete("delete from t_user where id=#{id}")
    void deleteUser(int id);
    //根据用户名查询用户信息
    @Select("SELECT id,name,age FROM t_user where name=#{username}")
    User findByName(@Param("userName") String userName);
    //查询所有
    @Select("SELECT id,name,age FROM t_user")
    List<User> findAll();


}
