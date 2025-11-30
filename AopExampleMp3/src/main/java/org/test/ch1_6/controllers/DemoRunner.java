package org.test.ch1_6.controllers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.test.ch1_6.services.ProductService;

@Component
public class DemoRunner implements CommandLineRunner {

    private final ProductService productService;

    public DemoRunner(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void run(String... args) {
        System.out.println("\nCalling ProductService in DemoRunner...");
        String name = productService.getProductName();
        System.out.println("End of execution - DemoRunner, name = " + name);
    }
}
