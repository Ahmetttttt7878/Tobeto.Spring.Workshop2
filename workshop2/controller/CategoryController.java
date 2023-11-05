package com.tobeto.spring.workshop2.controller;

import com.tobeto.spring.workshop2.Modul.Category;
import com.tobeto.spring.workshop2.service.abstracts.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/categories")

public class CategoryController {
    CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService){
        this.categoryService =categoryService;
    }

    @GetMapping("/getall")
    public List<Category>getallCategories(){
        return this.categoryService.getall();
    }
    @GetMapping ("/get/{id}")
    public Category getCategoryById(@PathVariable int id){
        return this.categoryService.getById(id);
    }
    @PostMapping("/update/{id}")
    public String updateCategory(@PathVariable int id, @RequestBody Category updatedCategory){
        return this.categoryService.updateCategory(id,updatedCategory);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCategory(@PathVariable int id){
        return this.categoryService.delete(id);
    }




}
