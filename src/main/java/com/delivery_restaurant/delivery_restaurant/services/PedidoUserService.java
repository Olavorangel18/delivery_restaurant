package com.delivery_restaurant.delivery_restaurant.services;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.delivery_restaurant.delivery_restaurant.models.Pedido;
import com.delivery_restaurant.delivery_restaurant.models.User;
import com.delivery_restaurant.delivery_restaurant.repositories.PedidoRepository;
import com.delivery_restaurant.delivery_restaurant.repositories.UserRepository;

@Service

public class PedidoUserService {
    
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private UserRepository userRepository;
    
    public Pedido save(Pedido pedido) {
        UUID uuid = UUID.randomUUID();
        pedido.setId(uuid.toString());

        User user = this.userRepository.findByEmail(pedido.getEmail());
        pedido.setEmail(user.getEmail());

        this.userRepository.save(user);
        if(user.getPedidos() == null) {
            user.setPedidos(new ArrayList<Pedido>());
        }
        user.getPedidos().add(pedido);
        this.userRepository.save(user);
        return pedidoRepository.save(pedido);
    }
}
