package org.example.javaTest.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
