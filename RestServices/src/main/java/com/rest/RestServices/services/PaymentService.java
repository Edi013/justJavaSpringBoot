package com.rest.RestServices.services;

import com.rest.RestServices.exceptions.NotEnoughMoneyException;
import com.rest.RestServices.models.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}

