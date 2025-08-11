package org.example.paymentservice.services;

import org.example.paymentservice.paymentgateways.IPaymentGateway;
import org.example.paymentservice.paymentgateways.PaymentGatewayChooserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    public String initiatePayment(Long amount,String orderId,String phoneNumber,String name,String email) {
        IPaymentGateway paymentGateway = paymentGatewayChooserStrategy.getBestPaymentGateway();
        return paymentGateway.generatePaymentLink(amount,orderId,phoneNumber,name,email);
    }
}
