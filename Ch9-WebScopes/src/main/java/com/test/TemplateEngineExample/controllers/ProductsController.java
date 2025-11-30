package com.test.TemplateEngineExample.controllers;

import com.test.TemplateEngineExample.models.Product;
import com.test.TemplateEngineExample.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
public class ProductsController {

    private final ProductService productService;

    public ProductsController(
            ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }

    // Version #1
    @PostMapping(path = "/products")
    public String addProduct(
            @RequestParam String name,
            @RequestParam double price,
            Model model
    ) {
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        productService.addProduct(p);

        var products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }

    // Version #2
//    @PostMapping(path = "/products")
//    public String addProduct(
//            Product p,
//            Model model
//    ) {
//            productService.addProduct(p);
//
//            var products = productService.findAll();
//            model.addAttribute("products", products);
//
//            return "products.html";
//    }
}
