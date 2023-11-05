package com.tobeto.spring.workshop2.repository.abstracts;

import com.tobeto.spring.workshop2.Modul.User;

import java.util.List;

public interface UserRepository {
    String add(User user);
    List<User> getall();
    String delete(int id);
    String updateUser(int id, User updateUser);
    User getById(int id);

}
