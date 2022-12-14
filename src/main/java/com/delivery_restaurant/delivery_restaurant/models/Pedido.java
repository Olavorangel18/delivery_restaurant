package com.delivery_restaurant.delivery_restaurant.models;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Pedido {
    
    @Id
    private String id;
    @Field
    @NotNull(message = "Codigo is compulsory")
    private String codigo;
    @Field
    @NotNull(message = "email is compulsory")
    private String email;
    @Field
    @NotNull(message = "restaurante is compulsory")
    private String restaurante;
    @Field 
    @NotNull(message = "Comida is compulsory")
    private String comida;

    
    public Pedido(String codigo, String email, String restaurante, String comida) {
        this.codigo = codigo;
        this.email = email;
        this.restaurante = restaurante;
        this.comida = comida;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
