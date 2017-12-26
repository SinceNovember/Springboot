package com.liu.service;

import com.liu.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getUserList();

    public User findUserById(Long id);

    public void save(User user);

    public void edit(User user);

    public void delete(Long id);
}
