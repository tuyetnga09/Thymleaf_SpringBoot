package com.example.thymleafspringboot.controller;

import com.example.thymleafspringboot.entity.Category;
import com.example.thymleafspringboot.entity.Product;
import com.example.thymleafspringboot.repository.CategoryRepository;
import com.example.thymleafspringboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/products/new")
    public String showNewFormProduct(Model model)
    {
        List<Category> listCategories = categoryRepository.findAll();
        model.addAttribute("product", new Product());
        model.addAttribute("listCategories", listCategories);
        return "product_form";
    }
    @GetMapping("/products")
    public String listProduct(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("product", products);
        return "product";
    }
    @PostMapping("/product/save")
    public String createProduct(Product product)
    {
        productRepository.save(product);
       return "redirect:/products";
    }

    @GetMapping("/products/edit/{id}")
    public String showEditFormProduct(@PathVariable("id") Integer id, Model model)
    {
         Product product =  productRepository.findById(id).get();
        model.addAttribute("product", product);
        List<Category> listCategories = categoryRepository.findAll();
        model.addAttribute("listCategories", listCategories);
        return "product_form";
    }
}
