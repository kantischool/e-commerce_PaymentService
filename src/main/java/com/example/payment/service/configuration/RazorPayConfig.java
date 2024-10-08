package com.example.payment.service.configuration;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorPayConfig {

    public RazorpayClient createRazorPayClient() throws RazorpayException {

       return  new RazorpayClient("", "");

    }
}
