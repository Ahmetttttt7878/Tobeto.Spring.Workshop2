package com.tobeto.spring.workshop2.repository.abstracts;

import com.tobeto.spring.workshop2.Modul.Product;

import java.util.List;

public interface ProductRepository {
    String add(Product product);
    List<Product> getall();
    String delete(int id);

    String updateProduct(int id, Product updateProduct);

    Product getById(int id);

}


