package com.delivery_restaurant.delivery_restaurant.models;



import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class User {

    @Id
    private String id;
    @Field
    @NotNull(message = "First Name is compulsory")
    private String firstName;
    @Field
    @NotNull(message = "Last Name is compulsory")
    private String lastName;
    @Field
    @NotNull(message = "Email is compulsory")
    @Indexed(unique=true)
    private String email;
    @Field
    private Endereco endereco;
    @Field
    private List<Pedido> pedidos;

    public User(String firstName, String lastName, String email, Endereco endereco, List<Pedido> pedidos) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.endereco = endereco;
        this.pedidos = pedidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    
    
}
