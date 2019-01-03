package com.asiainfo.ctc.controller;

import com.asiainfo.ctc.entity.User;
import com.asiainfo.ctc.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: shenxl
 * @Date: 2019/1/3 11:49
 * @Version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/id")
    @ResponseBody
    public Map<String, User> findById(@RequestParam("id") Integer id){
        User user=userService.findById(id);
        Map<String,User> objectMap=new HashMap<>();
        objectMap.put("user",user);
        return objectMap;
    }
    @RequestMapping("/index")
    @ResponseBody
    public String findById(){

        return "hello!";
    }


}
