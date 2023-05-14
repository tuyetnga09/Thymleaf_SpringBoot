package com.example.thymleafspringboot.controller;

import com.example.thymleafspringboot.entity.Category;
import com.example.thymleafspringboot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public String listCategories(Model model) {
        List<Category> categoryList = categoryRepository.findAll();
        model.addAttribute("category", categoryList);
        return "categories";
    }
    @GetMapping("/categories/new")
    public String newFormCategory(Model model) {
        model.addAttribute("category", new Category());
        return "categories_form";
    }
    @PostMapping("/categories/save")
    public String createCategory(Category category)
    {
        categoryRepository.save(category);
        return "redirect:/categories";
    }
}
