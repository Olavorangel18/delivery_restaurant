package com.delivery_restaurant.models;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Cliente extends User{

    
    @Field
    private Endereco endereco;

    public Cliente(String firstName, String lastName, Endereco endereco) {
        super(firstName, lastName);
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
}
