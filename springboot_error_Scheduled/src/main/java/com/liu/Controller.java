package com.liu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/find")
    public String findByName()
    {
        System.out.println(userMapper.findByName("AAAA").getAge());
        return "success!";
    }
    @RequestMapping("/insert")
    public String insert(@RequestParam(value = "name")String name,@RequestParam(value = "age")Integer age ){
        userMapper.insert(name, age);
        return "insertsuccess";
    }

}

