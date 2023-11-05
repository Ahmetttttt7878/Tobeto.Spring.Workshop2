package com.tobeto.spring.workshop2.repository.concretes;

import com.tobeto.spring.workshop2.Modul.Product;
import com.tobeto.spring.workshop2.repository.abstracts.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class MemoryProductRepository implements ProductRepository {
    List<Product> products;

    public MemoryProductRepository(){
        this.products = new ArrayList<>();
        products.add(new Product(1,"Phone",1499.99,100,"Electronics"));
        products.add(new Product(2,"TV",2599.99,50,"Electronics"));
        products.add(new Product(3,"Book",19.99,200,"Books"));
        products.add(new Product(4,"Clothing",49.99,150,"Fashion"));
        products.add(new Product(5,"Watch",299.99,80,"Accessories"));
    }


    @Override
    public String add(Product product) {
        products.add(product);
        return product.getName() + "product added successfully.";
    }

    @Override
    public List<Product> getall() {
        return products;
    }

    @Override
    public String delete(int id) {
        Product product = products.stream().filter(p -> p.getId()== id).findFirst().orElseThrow();
        products.remove(product);
        return product.getName() + "product deleted successfully";
    }
    @Override
    public String updateProduct(int id, Product updateProduct) {
        Product product =products.stream().filter(p -> p.getId()==id).findFirst().orElseThrow();
        product.setName(updateProduct.getName());
        product.setStock(updateProduct.getStock());
        product.setCategory(updateProduct.getCategory());
        product.setPrice(updateProduct.getPrice());
        return "Product updated! \nID: " + id + ", \nNew Information: \nName: " + updateProduct.getName()
                + ", \nCategory: " + updateProduct.getCategory() + ", \nStock: " + updateProduct.getStock()
                + "\nPrice: " + updateProduct.getPrice();
    }


    @Override
    public Product getById(int id) {
        Product product = products.stream().filter(p -> p.getId()==id).findFirst().orElseThrow();
        return product;
    }
}
