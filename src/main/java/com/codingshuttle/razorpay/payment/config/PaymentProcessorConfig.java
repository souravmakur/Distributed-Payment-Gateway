package com.codingshuttle.razorpay.payment.config;

import com.codingshuttle.razorpay.common.enums.PaymentMethod;
import com.codingshuttle.razorpay.payment.gateway.processor.PaymentProcessor;
import com.codingshuttle.razorpay.payment.gateway.processor.strategy.CardPaymentProcessor;
import com.codingshuttle.razorpay.payment.gateway.processor.strategy.NetbankingPaymentProcessor;
import com.codingshuttle.razorpay.payment.gateway.processor.strategy.UpiPaymentProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class PaymentProcessorConfig {

    @Bean
    public Map<PaymentMethod, PaymentProcessor> paymentProcessorMap() {
        return Map.of(
                PaymentMethod.CARD, new CardPaymentProcessor(),
                PaymentMethod.NETBANKING, new NetbankingPaymentProcessor(),
                PaymentMethod.UPI, new UpiPaymentProcessor()
        );
    }
}
