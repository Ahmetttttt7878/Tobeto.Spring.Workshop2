package com.tobeto.spring.workshop2.service.concretes;

import com.tobeto.spring.workshop2.Modul.User;
import com.tobeto.spring.workshop2.repository.abstracts.UserRepository;
import com.tobeto.spring.workshop2.service.abstracts.UserService;

import java.util.List;

public class UserManager implements UserService {
    UserRepository users;

    public UserManager(UserRepository users){
        this.users = users;
    }
    @Override
    public List<User> getall() {
        return users.getall();
    }

    @Override
    public String add(User user) {
        return users.add(user);
    }

    @Override
    public String delete(int id) {
        return users.delete(id);
    }

    @Override
    public String updateUser(int id, User updateUser) {
        return users.updateUser(id,updateUser);
    }

    @Override
    public User getById(int id) {
        return users.getById(id);
    }
}
