package com.example.pojo;/*
 * @Author liulu17
 * @Date 2023/6/2 11:39
 */

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String sex;
    private String email;
    private Integer age;
}
