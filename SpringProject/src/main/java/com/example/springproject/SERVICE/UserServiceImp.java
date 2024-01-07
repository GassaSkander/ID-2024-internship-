package com.example.springproject.SERVICE;

import com.example.springproject.ENTITY.User;
import com.example.springproject.REPOSITORY.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImp implements UserSerivce{

    UserRepository userRepository;

    @Override
    public List<User> retrieveAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User AddUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void DeleteUser(Integer idUser) {
        userRepository.deleteById(idUser);
    }

    @Override
    public User UpdateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User retrieveUser(Integer idUser) {
        return userRepository.findById(idUser).get();
    }
}
