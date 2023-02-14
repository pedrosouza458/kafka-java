package com.pedro.paymentservice.service;

import com.pedro.paymentservice.model.Payment;

public interface PaymentService {
    void sendPayment(Payment payment);
}
