package com.delivery_restaurant.delivery_restaurant.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.delivery_restaurant.delivery_restaurant.models.Entrega;

@Repository
public interface EntregaRepository extends MongoRepository<Entrega,String>{
}
