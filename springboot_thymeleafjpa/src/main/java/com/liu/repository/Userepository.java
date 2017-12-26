package com.liu.repository;

import com.liu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userepository extends JpaRepository<User,Long>{
    User findById(Long id);

    Long deleteById(Long id);
}
