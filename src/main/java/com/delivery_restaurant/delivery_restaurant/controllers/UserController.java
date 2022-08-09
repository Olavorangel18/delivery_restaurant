package com.delivery_restaurant.delivery_restaurant.controllers;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.delivery_restaurant.delivery_restaurant.models.User;
import com.delivery_restaurant.delivery_restaurant.services.UserService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@SecurityRequirement(name = "restaurantapi")
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
        UUID uuid = UUID.randomUUID();
        user.setId(uuid.toString());
        return this.userService.save(user);
    }

    @DeleteMapping(value="/delete")
    public void deleteUser(@RequestBody User user) {
        this.userService.delete(user);
    }

    @DeleteMapping(value="/{id}")
    public void deleteUserById(@RequestParam(value="id") String id) {
        this.userService.deleteById(id);
    }

    @PutMapping(value="/update")
    public void updateUser(@RequestBody User user) {
        this.userService.update(user);
    }

}
