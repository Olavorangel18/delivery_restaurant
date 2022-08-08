package com.delivery_restaurant.delivery_restaurant.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery_restaurant.delivery_restaurant.models.User;
import com.delivery_restaurant.delivery_restaurant.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> getAllUser() {
        return this.userService.getAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@RequestParam(value="id") String id) {
        return this.userService.getById(id);
    }

    @PostMapping(value="/save")
    public User saveUser(@RequestBody User user) {
        return this.userService.save(user);
    }

    @PostMapping(value="/delete")
    public void deleteUser(@RequestBody User user) {
        this.userService.delete(user);
    }

    @PostMapping(value="/deleteById")
    public void deleteUserById(@RequestParam(value="id") String id) {
        this.userService.deleteById(id);
    }

    @PostMapping(value="/update")
    public void updateUser(@RequestBody User user) {
        this.userService.update(user);
    }
    
    

}
