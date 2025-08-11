package org.example.paymentservice.controllers;

import org.example.paymentservice.dtos.InitiatePaymentRequestDto;
import org.example.paymentservice.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto initiatePaymentRequestDto) {
        return paymentService.initiatePayment(initiatePaymentRequestDto.getAmount(),initiatePaymentRequestDto.getOrderId(),initiatePaymentRequestDto.getPhoneNumber(),initiatePaymentRequestDto.getName(),initiatePaymentRequestDto.getEmail());
    }
}
