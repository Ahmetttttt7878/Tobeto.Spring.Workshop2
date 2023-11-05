package com.tobeto.spring.workshop2.service.concretes;
import com.tobeto.spring.workshop2.Modul.Product;
import com.tobeto.spring.workshop2.repository.abstracts.ProductRepository;
import com.tobeto.spring.workshop2.service.abstracts.ProductService;

import java.util.List;

public class ProductManager implements ProductService {
    ProductRepository products;

    public ProductManager(ProductRepository productRepository){
        this.products = productRepository;
    }


    @Override
    public List<Product> getall() {
        return products.getall();
    }

    @Override
    public String add(Product product) {
        return products.add(product);
    }

    @Override
    public String delete(int id) {
        return products.delete(id);
    }

    @Override
    public String updateProduct(int id, Product updateProduct) {
        return products.updateProduct(id,updateProduct);
    }

    @Override
    public Product getById(int id) {
        return products.getById(id);
    }
}
