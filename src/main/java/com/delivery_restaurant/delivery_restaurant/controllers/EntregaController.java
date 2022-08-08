package com.delivery_restaurant.delivery_restaurant.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.delivery_restaurant.delivery_restaurant.models.Entrega;
import com.delivery_restaurant.delivery_restaurant.services.EntregaService;

@RestController
@RequestMapping("/entrega")
public class EntregaController {

    @Autowired
    private EntregaService entregaService;
        
        @RequestMapping("/getAll")
        public List<Entrega> getAllEntrega() {
            return this.entregaService.getAll();
        }
        
        @RequestMapping("/getEntregasById")
        public Entrega getEntregaById(@RequestParam(value="id") String id) {
            return this.entregaService.getById(id);
        }
        
        @RequestMapping("/save")
        public Entrega saveEntrega(@RequestBody Entrega entrega) {
            return this.entregaService.save(entrega);
        }
        
        @RequestMapping("/delete")
        public void deleteEntrega(@RequestBody Entrega entrega) {
            this.entregaService.delete(entrega);
        }
        
        @RequestMapping("/deleteById")
        public void deleteEntregaById(@RequestParam(value="id") String id) {
            this.entregaService.deleteById(id);
        }
        
        @RequestMapping("/update")
        public void updateEntrega(@RequestBody Entrega entrega) {
            this.entregaService.update(entrega);
        }
        
    
}
