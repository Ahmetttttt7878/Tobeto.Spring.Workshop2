package com.tobeto.spring.workshop2.service.abstracts;
import com.tobeto.spring.workshop2.Modul.Product;

import java.util.List;

public interface ProductService {
List<Product> getall();
String add(Product product);
String delete(int id);
String updateProduct(int id, Product updateProduct);
Product getById(int id);
}
