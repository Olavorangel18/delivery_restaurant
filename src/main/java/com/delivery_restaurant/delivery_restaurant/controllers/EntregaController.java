package com.delivery_restaurant.delivery_restaurant.controllers;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.delivery_restaurant.delivery_restaurant.models.Entrega;
import com.delivery_restaurant.delivery_restaurant.services.EntregaService;
import com.delivery_restaurant.delivery_restaurant.services.PedidoService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@SecurityRequirement(name = "restaurantapi")
@RequestMapping("/entrega")
public class EntregaController {

    @Autowired
    private EntregaService entregaService;
    @Autowired 
    private PedidoService pedidoService;
        
        @GetMapping()
        public List<Entrega> getAllEntrega() {
            return this.entregaService.getAll();
        }
        
        @GetMapping("/{id}")
        public Entrega getEntregaById(@RequestParam(value="id") String id) {
            return this.entregaService.getById(id);
        }
        
        @PostMapping("/save")
        public Entrega saveEntrega(@RequestBody Entrega entrega) {
            return this.entregaService.save(entrega);
        }
        
        @DeleteMapping("/delete")
        public void deleteEntrega(@RequestBody Entrega entrega) {
            this.entregaService.delete(entrega);
        }
        
        @DeleteMapping("/{id}")
        public void deleteEntregaById(@RequestParam(value="id") String id) {
            this.entregaService.deleteById(id);
        }
        
        @PutMapping("/update")
        public void updateEntrega(@RequestBody Entrega entrega) {
            this.entregaService.update(entrega);
        }

        
    
}
