package com.codingshuttle.razorpay.payment.dto.response;

import com.codingshuttle.razorpay.common.entity.Money;
import com.codingshuttle.razorpay.common.enums.PaymentMethod;
import com.codingshuttle.razorpay.common.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL) //This would remove all the feilds that are null and would send the ones that are valid.
public record PaymentResponse(
        UUID id,
        UUID orderId,
        UUID merchantId,
        Money amount,
        PaymentStatus status,
        PaymentMethod method,
        Map<String,Object> methodDetails,
        String cardLastFour,
        String cardBrand,
        String BankReference,
        String errorCode,
        String errorDescription,
        Long refundedAmountPaise,
        LocalDateTime capturedAt,
        LocalDateTime createdAt
) {
}
