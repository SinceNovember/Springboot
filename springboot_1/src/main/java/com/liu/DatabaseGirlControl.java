package com.liu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
/**
 *  利用JPA用于跟数据库交互
 */
public class DatabaseGirlControl {
    @Autowired
    private DataBaseRepository dataBaseRepository;

    /**
     * 获取所有信息
     */
    @GetMapping(value = "/girls")
    public List<Girl> getList(){
        System.out.println(dataBaseRepository.findAll());
    return dataBaseRepository.findAll();
    }
    /**.
     * 添加一个信息
     */

    @RequestMapping(value="/girlsadd")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age)
    {
        Girl girl=new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return dataBaseRepository.save(girl);

    }

    /**
     * 根据Id获取用户
     */
    @RequestMapping("/girls/{id}")
    public Girl getGirlById(@PathVariable(value = "id") Integer id)
    {
        Girl girl=dataBaseRepository.findOne(id);
        System.out.println(girl);
        return girl;
    }

    /**
     *根据id进行删除
     */
    @RequestMapping("/deletegirl/{id}")
    public String deleteGirlById(@PathVariable(value = "id") int id)
    {
        dataBaseRepository.delete(id);
        return "deleteSuccess";
    }

    /**
     *根据id更新数据
     */
    @RequestMapping("/updatagirl/{id}")
    public String updateGirl(@PathVariable(value = "id") int id,@RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age)
    {
        Girl girl=new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        dataBaseRepository.save(girl);
        return "update success";
    }

    /**
     * 根据年龄查询
     */
    @RequestMapping("/girls/age/{age}")
    public List<Girl> findbyAge(@PathVariable(value = "age")Integer age)
    {
        List<Girl> girl=dataBaseRepository.findByAge(age);
        System.out.println(girl);
        return girl;
    }

    /**
     * 事务管理用 @Transactional
     */
    @Transactional
    @RequestMapping("/transation")
    public String insertTwo(){
         Girl girla=new Girl();
         girla.setCupSize("A");
         girla.setAge(111);
         dataBaseRepository.save(girla);
        Girl girlb=new Girl();
        girlb.setCupSize("A");
        girlb.setAge(222);
        dataBaseRepository.save(girlb);
        return "shiwu";
    }


}
