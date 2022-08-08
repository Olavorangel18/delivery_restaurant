package com.delivery_restaurant.delivery_restaurant.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.delivery_restaurant.delivery_restaurant.models.Pedido;
import com.delivery_restaurant.delivery_restaurant.services.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @RequestMapping("/getAll")
    public List<Pedido> getAllPedido() {
        return this.pedidoService.getAll();
    }

    @RequestMapping("/getPedidosById")
    public Pedido getPedidoById(@RequestParam(value="id") String id) {
        return this.pedidoService.getById(id);
    }

    @RequestMapping("/save")
    public Pedido savePedido(@RequestBody Pedido pedido) {
        return this.pedidoService.save(pedido);
    }

    @RequestMapping("/delete")
    public void deletePedido(@RequestBody Pedido pedido) {
        this.pedidoService.delete(pedido);
    }

    @RequestMapping("/deleteById")
    public void deletePedidoById(@RequestParam(value="id") String id) {
        this.pedidoService.deleteById(id);
    }

    @RequestMapping("/update")
    public void updatePedido(@RequestBody Pedido pedido) {
        this.pedidoService.update(pedido);
    }
    
}
