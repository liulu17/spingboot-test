package com.example.service;

import com.example.pojo.User;

import java.util.List;

/*
 * @Author liulu17
 * @Date 2023/6/2 11:41
 */
public interface HelloService {
    public List<User> getAllUser();

    public String getNameById(Integer id);

}
