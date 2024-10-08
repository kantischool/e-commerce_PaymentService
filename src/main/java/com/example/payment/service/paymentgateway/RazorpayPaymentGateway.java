package com.example.payment.service.paymentgateway;

import com.example.payment.service.modal.enums.PaymentStatus;

public class RazorpayPaymentGateway implements PaymentGatewayInterface{

    @Override
    public String createPaymentLink(Long amount, String userName, String userEmail, String userPhoneNo) {
        return null;
    }

    @Override
    public PaymentStatus getPaymentStatus() {
        return null;
    }
}
