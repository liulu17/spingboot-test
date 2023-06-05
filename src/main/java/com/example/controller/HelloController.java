package com.example.controller;
import com.example.pojo.User;
import com.example.service.HelloService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/*
 * @Author liulu17
 * @Date 2023/6/2 11:40
 */
@RestController
@CrossOrigin(origins = "*")
public class HelloController {

    @Resource
    private HelloService helloService;
//    @GetMapping(value = "/hello")
//    public List<User> Hello() {
//        return helloService.getAllUser();
////        return "Ok";
//    }


    @GetMapping(value="/{hello}", params = {"id!=3"})
    public String getNameById(@RequestParam(value = "id") Integer id, @PathVariable(value = "hello") String msg,
                              @RequestHeader(value = "Accept-Language") String al) {
        System.out.println("controller 请求id为："+id);
        System.out.println("msg is :" + msg);
        System.out.println("al is :" + al);
        return helloService.getNameById(id);
    }
}
