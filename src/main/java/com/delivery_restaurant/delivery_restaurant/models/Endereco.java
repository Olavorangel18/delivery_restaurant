package com.delivery_restaurant.models;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Endereco {

    @Field
    private String rua;
    @Field
    private String cep;
    @Field
    private String bairro;
    @Field
    private String cidade;

    public Endereco(String rua, String cep, String bairro, String cidade) {
        this.rua = rua;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
}

