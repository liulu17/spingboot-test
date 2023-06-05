package com.example.service;

import com.example.mapper.HelloMapper;
import com.example.pojo.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HelloServiceImpl implements  HelloService{
    @Resource
    private HelloMapper helloMapper;
    @Override
    public List<User> getAllUser() {
        return helloMapper.getAllUser();
    }

    @Override
    @Cacheable(cacheNames = "name", key = "#id")
    public String getNameById(Integer id) {
        System.out.println("查询id="+id+"的名称");
        return helloMapper.getNameById(id);
    }


}
