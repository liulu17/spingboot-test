package com.example.mapper;

/*
 * @Author liulu17
 * @Date 2023/6/2 11:40
 */


import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//import org.springframework.web.bind.annotation.Mapping;
@Mapper
public interface HelloMapper {
    @Select("select * from user")
    public List<User> getAllUser();

    @Select("select name from user where id=#{id}")
    public String getNameById(Integer id);
}
