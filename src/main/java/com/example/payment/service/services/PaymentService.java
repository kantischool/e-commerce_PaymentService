package com.example.payment.service.services;

import com.example.payment.service.paymentgateway.PaymentGatewayInterface;
import com.example.payment.service.paymentgateway.RazorpayPaymentGateway;
import com.example.payment.service.response.ProductLinkResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public ProductLinkResponse createPaymentLink(String orderId){
        // fetch order detail.

        Long amount = 1000L;
        String userName = "kanti";
        String userEMail = " kanti@exampl.com";
        String userPhoneNo = "+919999900000";

        // select payment gateway using factory method.
        PaymentGatewayInterface paymentGateway = new RazorpayPaymentGateway();

         String paymentLink = paymentGateway.createPaymentLink(amount, userName, userEMail, userPhoneNo);
         ProductLinkResponse productLinkResponse = new ProductLinkResponse();
         productLinkResponse.setPaymentLink(paymentLink);

         return productLinkResponse;
    }
}
