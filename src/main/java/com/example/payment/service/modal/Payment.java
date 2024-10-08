package com.example.payment.service.modal;

import com.example.payment.service.modal.enums.PaymentGateway;
import com.example.payment.service.modal.enums.PaymentStatus;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private Double amount;
    private String userId;
    private String orderId;
    private String paymentLink;
    private PaymentGateway paymentGateway;
    private PaymentStatus paymentStatus;

}
