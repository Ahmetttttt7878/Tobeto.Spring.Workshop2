package com.tobeto.spring.workshop2.service.concretes;

import com.tobeto.spring.workshop2.Modul.Category;
import com.tobeto.spring.workshop2.repository.abstracts.CategoryRepository;

import java.util.List;

public class CategoryManager implements CategoryRepository {
    CategoryRepository categories;

    public CategoryManager(CategoryRepository categoryRepository){
        this.categories = categoryRepository;
    }
    @Override
    public String add(Category category) {
        return categories.add(category);
    }

    @Override
    public List<Category> getall() {
        return categories.getall();
    }

    @Override
    public String delete(int id) {
        return categories.delete(id);
    }

    @Override
    public String updateCategory(int id, Category updateCategory) {
        return categories.updateCategory(id, updateCategory);
    }

    @Override
    public Category getById(int id) {
        return categories.getById(id);
    }
}
