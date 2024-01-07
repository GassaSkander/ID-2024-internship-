package com.example.springproject.CONTROLLERS;


import com.example.springproject.ENTITY.User;
import com.example.springproject.SERVICE.UserSerivce;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("UserManagement")
@RestController
@AllArgsConstructor
public class UserController {
    UserSerivce userSerivce;

    @PostMapping("/addUser")
    User AddUser(@RequestBody User user){
        return userSerivce.AddUser(user);
    }

    @PutMapping("/modifyUser")
    User updateUser(@RequestBody User user){
        return userSerivce.UpdateUser(user);
    }

    @GetMapping("/showAllUsers")
    List<User> retreiveAll(){
        return userSerivce.retrieveAllUsers();
    }

    @GetMapping("/showUser/{idUser}")
    User retrieveUser(@PathVariable Integer idUser){
        return userSerivce.retrieveUser(idUser);
    }

    @DeleteMapping("/deleteUser/{idUser}")
    void deleteUser(@PathVariable Integer idUser){
        userSerivce.DeleteUser(idUser);
    }
}
