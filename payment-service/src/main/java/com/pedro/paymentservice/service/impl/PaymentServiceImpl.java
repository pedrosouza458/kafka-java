package com.pedro.paymentservice.service.impl;

import com.pedro.paymentservice.model.Payment;
import com.pedro.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
        log.info("\n PAYMENT_SERVICE_IMPL ::: \n Recebi o pagamento: \n {}", payment);
    }
}
