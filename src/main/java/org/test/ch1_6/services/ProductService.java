package org.test.ch1_6.services;

import org.springframework.stereotype.Service;
import org.test.ch1_6.ToLog;

@Service
public class ProductService {

    @ToLog
    public String getProductName() {
        return "MacBook Pro 16";
    }
}
