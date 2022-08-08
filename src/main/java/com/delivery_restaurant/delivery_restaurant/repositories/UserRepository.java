package com.delivery_restaurant.delivery_restaurant.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.delivery_restaurant.delivery_restaurant.models.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> {    
        User findByEmail(String email);
}
