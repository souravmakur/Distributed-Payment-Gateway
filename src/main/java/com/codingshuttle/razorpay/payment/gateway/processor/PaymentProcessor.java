package com.codingshuttle.razorpay.payment.gateway.processor;

import com.codingshuttle.razorpay.payment.gateway.processor.dto.PaymentProcessorRequest;
import com.codingshuttle.razorpay.payment.gateway.processor.dto.PaymentProcessorResponse;

public interface PaymentProcessor {
   PaymentProcessorResponse charge (PaymentProcessorRequest request);
}
