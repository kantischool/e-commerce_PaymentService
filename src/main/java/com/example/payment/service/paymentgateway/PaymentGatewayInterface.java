package com.example.payment.service.paymentgateway;

import com.example.payment.service.modal.enums.PaymentStatus;

public interface PaymentGatewayInterface {

    public String createPaymentLink(
            Long amount,
            String userName,
            String userEmail,
            String userPhoneNo
    );

    PaymentStatus getPaymentStatus();
}
