package com.example.springproject.SERVICE;

import com.example.springproject.ENTITY.User;

import java.util.List;

public interface UserSerivce {

    List<User> retrieveAllUsers();

    User AddUser(User user);

    void DeleteUser(Integer idUser);

    User UpdateUser(User user);

    User retrieveUser(Integer idUser);
}
