package org.test.ch1_6.services;

import org.springframework.stereotype.Component;

@Component
public class TestClient{
    private final ProductService productService;

    TestClient(ProductService productService){
        this.productService = productService;
    }

    public void test(){
        System.out.println("\nCalling ProductService in TestClient");
        var name = productService.getProductName();
        System.out.println("End of execution - TestCleint, name : " + name);
    }
}