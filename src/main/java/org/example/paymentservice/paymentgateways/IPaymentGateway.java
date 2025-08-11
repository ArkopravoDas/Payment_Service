package org.example.paymentservice.paymentgateways;

import lombok.Getter;
import lombok.Setter;

public interface IPaymentGateway {
    String generatePaymentLink(Long amount,String orderId,String phoneNumber,String name,String email);
}
