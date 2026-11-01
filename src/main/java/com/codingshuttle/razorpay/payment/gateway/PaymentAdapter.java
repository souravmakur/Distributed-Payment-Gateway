package com.codingshuttle.razorpay.payment.gateway;

import com.codingshuttle.razorpay.payment.gateway.dto.PaymentRequest;

public interface PaymentAdapter {

    void initiate(PaymentRequest request);
}
