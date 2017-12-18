package com.liu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DataBaseRepository extends JpaRepository<Girl,Integer>{//JPA方式
    List<Girl> findByAge(Integer age);//通过年龄查询,自己添加的方法，但是方法名称必须按规格来定不能乱写
}
