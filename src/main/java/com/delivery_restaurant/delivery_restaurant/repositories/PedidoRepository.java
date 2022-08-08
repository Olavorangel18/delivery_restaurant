package com.delivery_restaurant.delivery_restaurant.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.delivery_restaurant.delivery_restaurant.models.Pedido;
import com.delivery_restaurant.delivery_restaurant.models.User;

@Repository
public interface PedidoRepository  extends MongoRepository<Pedido,String> {
    public Optional<Pedido> findById(String id);
}
