package org.test.ch1_6.services;

import org.springframework.stereotype.Service;
import org.test.ch1_6.Secure;

@Service
public class ProductService {

    @Secure
    public String getProductName() {
        return "MacBook Pro 16";
    }
}
