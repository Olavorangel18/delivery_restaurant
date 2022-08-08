package com.delivery_restaurant.delivery_restaurant.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.delivery_restaurant.delivery_restaurant.models.Entrega;
import com.delivery_restaurant.delivery_restaurant.repositories.EntregaRepository;
@Service

public class EntregaService implements GeneralService<Entrega> {
        
        @Autowired
        private EntregaRepository entregaRepository;
        
        @Override
        public List<Entrega> getAll() {
            return this.entregaRepository.findAll();
        }
        
        @Override
        public Entrega getById(String id) {
            return this.entregaRepository.findById(id).get();
        }
        
        @Override
        public Entrega save(Entrega entrega) {
            return this.entregaRepository.save(entrega);
        }
        
        @Override
        public void delete(Entrega entrega) {
            this.entregaRepository.delete(entrega);
        }
        
        @Override
        public void deleteById(String id) {
            this.entregaRepository.deleteById(id);
        }
        
        @Override
        public void update(Entrega entrega) {
            this.entregaRepository.save(entrega);
        }
        
    
}
