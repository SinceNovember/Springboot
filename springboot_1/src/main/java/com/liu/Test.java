package com.liu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class Test {
   /*@Value("${cupSize}")
    private String cupSize;
    @Value("${content}")
    private String content;
    */
    @Autowired
    GirlProperties girlProperties;
    static Map<Integer,User> usermap= Collections.synchronizedMap(new HashMap<Integer, User>());
    static int i=0;
    static List<User> list=new ArrayList<User>();
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addUser(){
        User user=new User();
        user.setAge(1);
       user.setId(2);
       user.setName("liu");
        list.add(user);
        return "success";
    }
    @RequestMapping(value = "/allusers",method = RequestMethod.GET)
    public List<User> getUserList(){
        return list;
    }
    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }
    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String say()
    {
       return girlProperties.getContent();
    }
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(@RequestParam(value = "id",required = false,defaultValue="0") String id){
        return "id"+id;
    }

}


