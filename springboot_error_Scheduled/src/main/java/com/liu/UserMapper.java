package com.liu;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USER WHERE NAME=#{name}")
    User findByName(@Param("name")String name);
    @Insert("INSERT INTO USER(NAME,age) VALUES(#{name},#{age})")
    int insert(@Param("name")String name,@Param("age")Integer age);
}
