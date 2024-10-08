package com.example.payment.service.controller;

import com.example.payment.service.dtos.PaymentLinkRequestDto;
import com.example.payment.service.response.ProductLinkResponse;
import com.example.payment.service.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/link")
    public ProductLinkResponse createPaymentLink(PaymentLinkRequestDto paymentLinkRequestDto){
        return paymentService.createPaymentLink(paymentLinkRequestDto.getOrderID());
    }

    @PostMapping("/{paymentId}")
    public void checkPaymentStatus( @PathVariable("paymentId") String paymentId){

    }
}
