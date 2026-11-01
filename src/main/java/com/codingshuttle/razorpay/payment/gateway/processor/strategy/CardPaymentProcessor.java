package com.codingshuttle.razorpay.payment.gateway.processor.strategy;

import com.codingshuttle.razorpay.payment.gateway.processor.PaymentProcessor;
import com.codingshuttle.razorpay.payment.gateway.processor.dto.PaymentProcessorRequest;
import com.codingshuttle.razorpay.payment.gateway.processor.dto.PaymentProcessorResponse;

public class CardPaymentProcessor implements PaymentProcessor {

    @Override
    public PaymentProcessorResponse charge(PaymentProcessorRequest request) {
        return null;
    }
}
