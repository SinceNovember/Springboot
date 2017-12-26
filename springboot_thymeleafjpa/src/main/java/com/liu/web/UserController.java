package com.liu.web;

import com.liu.entity.User;
import com.liu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping("/")
    public String index(){
        return "redirect:/list";
    }
    @RequestMapping("/list")
    public String list(Model model)
    {
        List<User> userList=userService.getUserList();
        model.addAttribute("users",userList);
        return "user/list";
    }
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "user/userAdd";
    }
    @RequestMapping("/add")
    public String add(User user)
    {
        userService.save(user);
        System.out.println("111");
        return "redirect:/list";
    }
    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id)
    {
        User user=userService.findUserById(id);
        model.addAttribute("user",user);
        return "user/userEdit";
    }
    @RequestMapping("/edit")
    public String edit(User user)
    {
        userService.edit(user);
        return  "redirect:/list";
    }
    @RequestMapping("/delete")
    public String delete(Long id){
        System.out.println("id:"+id);
        System.out.println("2223");
        userService.delete(id);
        System.out.println("222");
        return "redirect:/list";
    }
    @RequestMapping("/find")
    public String findById(Model model,Long id)
    {
       User user= userService.findUserById(id);
       model.addAttribute("users",user);
       return "user/findById";


    }
}
