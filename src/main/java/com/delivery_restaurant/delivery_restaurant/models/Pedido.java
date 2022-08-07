package com.delivery_restaurant.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Pedido {
    
    @Id
    private long id;
    @Field
    private String codigo;
    @Field
    private Cliente cliente; // Precisa colocar flag para o MongoDB entender a cardinalidade
    @Field
    private String restaurante;
    @Field 
    private String comida;

    
    public Pedido(String codigo, Cliente cliente, String restaurante, String comida) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.restaurante = restaurante;
        this.comida = comida;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    
    
}
