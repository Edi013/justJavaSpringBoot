package com.rest.RestServices.controllers;

import com.rest.RestServices.exceptions.NotEnoughMoneyException;
import com.rest.RestServices.models.ErrorDetails;
import com.rest.RestServices.models.PaymentDetails;
import com.rest.RestServices.services.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {

    private static Logger logger =
            Logger.getLogger(PaymentController.class.getName());


    // curl for tests
    // curl.exe -v -X POST http://127.0.0.1:8080/payment -d '{"amount": 1000}' -H "Content-Type: application/json"
    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(
            @RequestBody PaymentDetails paymentDetails) {

        logger.info("Received payment " +
                paymentDetails.getAmount());

        return ResponseEntity
              .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }}