package com.liu.service.Impl;

import com.liu.entity.User;
import com.liu.repository.Userepository;
import com.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService{
    @Autowired
    private Userepository userRepository;

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id);
    }


    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void edit(User user) {
        userRepository.save(user);
    }


    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }

}
