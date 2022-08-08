package com.delivery_restaurant.delivery_restaurant.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery_restaurant.delivery_restaurant.models.Pedido;
import com.delivery_restaurant.delivery_restaurant.models.User;
import com.delivery_restaurant.delivery_restaurant.repositories.UserRepository;
@Service
public class UserService implements GeneralService<User> {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return this.userRepository.findAll();
    }
    
    @Override
    public User getById(String id) {
        return this.userRepository.findById(id).get();
    }
    
    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }
    
    @Override
    public void delete(User user) {
        this.userRepository.delete(user);
    }
    
    @Override
    public void deleteById(String id) {
        this.userRepository.deleteById(id);
    }
    
    @Override
    public void update(User user) {
        this.userRepository.save(user);
    }

    public User findByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }
}
    

