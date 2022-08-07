package com.delivery_restaurant.models;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Entrega {

    @Id
    private long id;
    @Field
    private String codigo;
    @Field
    private String data;
    @Field
    private String hora;
    @Field
    private String status;
    @Field
    private String restaurante;
    @Field
    private String entregador;

    public Entrega(String codigo, String data, String hora, String status, String restaurante, String entregador) {
        this.codigo = codigo;
        this.data = data;
        this.hora = hora;
        this.status = status;
        this.restaurante = restaurante;
        this.entregador = entregador;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public String getEntregador() {
        return entregador;
    }

    public void setEntregador(String entregador) {
        this.entregador = entregador;
    }
}
