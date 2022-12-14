package com.delivery_restaurant.delivery_restaurant.controllers;
import java.util.ArrayList;
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
import com.delivery_restaurant.delivery_restaurant.models.Pedido;
import com.delivery_restaurant.delivery_restaurant.models.User;
import com.delivery_restaurant.delivery_restaurant.services.PedidoService;
import com.delivery_restaurant.delivery_restaurant.services.PedidoUserService;
import com.delivery_restaurant.delivery_restaurant.services.UserService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@SecurityRequirement(name = "restaurantapi")
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private PedidoUserService pedidoUserService;

    @GetMapping()
    public List<Pedido> getAllPedido() {
        return this.pedidoService.getAll();
    }

    @GetMapping("/{id}")
    public Pedido getPedidoById(@RequestParam(value="id") String id) {
        return this.pedidoService.getById(id);
    }

    @PostMapping("/save")
    public Pedido savePedido(@RequestBody Pedido pedido) {
        return this.pedidoUserService.save(pedido);
    }

    @DeleteMapping("/delete")
    public void deletePedido(@RequestBody Pedido pedido) {
        this.pedidoService.delete(pedido);
    }

    @DeleteMapping("/{id}")
    public void deletePedidoById(@RequestParam(value="id") String id) {
        this.pedidoService.deleteById(id);
    }

    @PutMapping("/update")
    public void updatePedido(@RequestBody Pedido pedido) {
        this.pedidoService.update(pedido);
    }
    
}
