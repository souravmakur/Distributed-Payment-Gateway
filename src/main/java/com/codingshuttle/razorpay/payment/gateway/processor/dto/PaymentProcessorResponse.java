package com.codingshuttle.razorpay.payment.gateway.processor.dto;

public interface PaymentProcessorResponse{

    record pending(String processorReference) {}

    record Success(String processorReference , String bankRederence) {}

    record Failure(String errorCode, String errorDescription) {}

    }

