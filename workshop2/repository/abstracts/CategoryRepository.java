package com.tobeto.spring.workshop2.repository.abstracts;

import com.tobeto.spring.workshop2.Modul.Category;

import java.util.List;

public interface CategoryRepository {
    String add(Category category);
    List<Category> getall();
    String delete(int id);
    String updateCategory(int id, Category updateCategory);
    Category getById(int id);

}
