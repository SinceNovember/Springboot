package com.liu.mapper;

import com.liu.entitiy.UserEntity;
import com.liu.enums.UserSexEnum;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    List<UserEntity> getAll();

    @Select("SELECT * from users WHERE id=#{id}")
    @Results({
            @Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    UserEntity getOne(@Param("id") Long id);//可以用@Param传入Id到上面的#{id}

    @Insert("INSERT INTO users(userName,passWord,user_sex)VALUES(#{userName},#{passWord},#{userSex}")
    void insert(UserEntity userEntity);

    @Update("UPDATE users SET userName=#{userName},nick_name#{nickName} WHERE id=#{id}")
    void update(UserEntity userEntity);

    @Delete("DELETE FROM users WHERE id=#{id}")
    void delete(Long id);
}
