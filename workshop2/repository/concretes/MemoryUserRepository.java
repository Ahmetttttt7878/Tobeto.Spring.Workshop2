package com.tobeto.spring.workshop2.repository.concretes;

import com.tobeto.spring.workshop2.Modul.User;
import com.tobeto.spring.workshop2.repository.abstracts.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class MemoryUserRepository implements UserRepository {
    List<User> users;

    public MemoryUserRepository(){
        this.users = new ArrayList<>();
        users.add(new User(1,"John","john@john.com","john12","5343572837"));
        users.add(new User(2,"Michael","michael@michael.com","michael123","5333572837"));
        users.add(new User(3, "Sophia", "sophia@sophia.com", "sophia123", "5343682837"));
        users.add(new User(4, "Emma", "emma@emma.com", "emma123", "55551234"));
        users.add(new User(5, "Oliver", "oliver@oliver.com", "oliver123", "55552345"));
        users.add(new User(6, "Ava", "ava@ava.com", "ava123", "55563456"));

    }



    @Override
    public String add(User user) {
        users.add(user);
        return user.getName()+ " user added successfully";
    }

    @Override
    public List<User> getall() {
        return users;
    }

    @Override
    public String delete(int id) {
        User user = users.stream().filter(u -> u.getId() == id).findFirst().orElseThrow();
        users.remove(user);
        return user.getName() + " user deleted successfully";
    }

    @Override
    public String updateUser(int id, User updateUser) {
        User user = users.stream().filter(u -> u.getId()== id).findFirst().orElseThrow();user.setName(updateUser.getName());
        user.setPhone(updateUser.getPhone());
        user.setPassword(updateUser.getPassword());
        user.setEmail(updateUser.getEmail());

        return "User updated! \nID: " + id + ", \nNew Information: \nName: "
                + user.getName() + ", \nEmail: " + user.getEmail() + ", \nPassword: "
                + user.getPassword() + "\nPhone: " + user.getPhone();

    }

    @Override
    public User getById(int id) {
        User user = users.stream().filter(u -> u.getId() == id).findFirst().orElseThrow();
        return user;
    }


}
