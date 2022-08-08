package com.delivery_restaurant.delivery_restaurant.models;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Entrega {

    @Id
    private String id;
    @Field
    @NotNull(message = "Codigo is compulsory ")
    private String codigo;
    @Field
    @NotNull(message = "Data is compulsory ")
    private String data;
    @Field
    @NotNull(message = "Hora is compulsory ")
    private String hora;
    @Field
    @NotNull(message = "Status is compulsory")
    private String status;
    @Field
    @NotNull(message = "Restaurante is compulsory ")
    private String restaurante;
    @Field
    @NotNull(message = "Entregador is compulsory")
    private String entregador;

    public Entrega(String codigo, String data, String hora, String status, String restaurante, String entregador) {
        this.codigo = codigo;
        this.data = data;
        this.hora = hora;
        this.status = status;
        this.restaurante = restaurante;
        this.entregador = entregador;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
