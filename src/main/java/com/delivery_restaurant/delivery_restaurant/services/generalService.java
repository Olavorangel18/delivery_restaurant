package com.delivery_restaurant.delivery_restaurant.services;
import java.util.List;


public interface generalService<T> {
    public List<T> getAll(Class<T> clazz);
    public T getById(String id, Class<T> clazz);
    public T save(T t);
    public void delete(T t);
    public void deleteById(String id, Class<T> clazz);
    public void update(T t);
}

