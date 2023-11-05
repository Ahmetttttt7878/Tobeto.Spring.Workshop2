package com.tobeto.spring.workshop2.service.abstracts;

import com.tobeto.spring.workshop2.Modul.User;

import java.util.List;

public interface UserService {
    List<User> getall();
    String add(User user);
    String delete(int id);

    String updateUser(int id, User updateUser);
    User getById(int id);


}
