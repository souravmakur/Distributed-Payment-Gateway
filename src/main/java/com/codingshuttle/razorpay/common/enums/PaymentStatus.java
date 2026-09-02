package com.codingshuttle.razorpay.common.enums;

public enum PaymentStatus {
    CREATED,
    AUTHORIZING,
    AUTHORIZED,
    CAPTURING,
    CAPTURED,
    FAILED,
    CANCELED,
    REFUNDED,
    PARTIALLY_REFUNDED,
    AUTH_EXPRIED,
}
