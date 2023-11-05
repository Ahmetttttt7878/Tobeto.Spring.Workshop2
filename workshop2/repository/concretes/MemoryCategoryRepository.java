package com.tobeto.spring.workshop2.repository.concretes;

import com.tobeto.spring.workshop2.Modul.Category;
import com.tobeto.spring.workshop2.repository.abstracts.CategoryRepository;

import java.util.ArrayList;
import java.util.List;

public class MemoryCategoryRepository implements CategoryRepository {
    List<Category> categories;

    public MemoryCategoryRepository(){
        this.categories = new ArrayList<>();
        categories.add(new Category(1,"Electronics"));
        categories.add(new Category(2,"Books"));
        categories.add(new Category(3,"Fashion"));
        categories.add(new Category(4,"Accessories"));
    }

    @Override
    public String add(Category category) {
        categories.add(category);
        return category.getName()+ " category added successfuly";
    }

    @Override
    public List<Category> getall() {
        return categories;
    }

    @Override
    public String delete(int id) {
        Category category = categories.stream().filter(c -> c.getId() == id).findFirst().orElseThrow();
        categories.remove(category);
        return category.getName() + "category deleted succesfully!";
    }

    @Override
    public String updateCategory(int id, Category updateCategory) {
        Category category = categories.stream().filter(c -> c.getId() == id).findFirst().orElseThrow();

        category.setName(updateCategory.getName());
        return "Categpry update! \nID: "+ id + ", \nNew information: \nName:" + updateCategory.getName();
    }

    @Override
    public Category getById(int id) {
        Category category = categories.stream().filter(c -> c.getId() == id).findFirst().orElseThrow();
        return category;
    }
}
