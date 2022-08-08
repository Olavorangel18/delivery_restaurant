package com.delivery_restaurant.delivery_restaurant.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.delivery_restaurant.delivery_restaurant.models.Pedido;
import com.delivery_restaurant.delivery_restaurant.models.User;
import com.delivery_restaurant.delivery_restaurant.repositories.PedidoRepository;

@Service
public class PedidoService implements GeneralService<Pedido> {
        
        private PedidoRepository pedidoRepository;
        
        public PedidoService(PedidoRepository pedidoRepository) {
            this.pedidoRepository = pedidoRepository;
        }
        
        @Override
        public List<Pedido> getAll() {
            return pedidoRepository.findAll();
        }
        
        @Override
        public Pedido getById(String id) {
            return pedidoRepository.findById(id).orElse(null);
        }
        
        @Override
        public Pedido save(Pedido t) {
            return pedidoRepository.save(t);
        }
        
        @Override
        public void delete(Pedido t) {
            pedidoRepository.delete(t);
        }
        
        @Override
        public void deleteById(String id) {
            pedidoRepository.deleteById(id);
        }
        
        @Override
        public void update(Pedido t) {
            pedidoRepository.save(t);
        }

}

