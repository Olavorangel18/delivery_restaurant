package com.delivery_restaurant.delivery_restaurant.services;
import java.util.List;


public interface generalService<T> {
    public List<T> getAll();
    public T getById(String id);
    public T save(T t);
    public void delete(T t);
    public void deleteById(String id);
    public void update(T t);
}

