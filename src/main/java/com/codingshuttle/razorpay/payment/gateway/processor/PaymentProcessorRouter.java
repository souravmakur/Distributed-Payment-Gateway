package com.codingshuttle.razorpay.payment.gateway.processor;

import com.codingshuttle.razorpay.common.enums.PaymentMethod;
import com.codingshuttle.razorpay.payment.gateway.processor.dto.PaymentProcessorRequest;
import com.codingshuttle.razorpay.payment.gateway.processor.dto.PaymentProcessorResponse;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PaymentProcessorRouter {

    private Map<PaymentMethod, PaymentProcessor> paymentProcessors;

    public PaymentProcessorResponse charge(PaymentProcessorRequest request) {
        PaymentProcessor processor = paymentProcessors.get(request.method());
        if(processor == null) {
            throw new IllegalArgumentException("No payment processor registered for method: " + request.method());
        }
        return processor.charge(request);
    }
}
