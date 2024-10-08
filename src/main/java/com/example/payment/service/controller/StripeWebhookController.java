package com.example.payment.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook/strip")
public class StripeWebhookController {
    public void handleWebhookEvent(){

    }
}
