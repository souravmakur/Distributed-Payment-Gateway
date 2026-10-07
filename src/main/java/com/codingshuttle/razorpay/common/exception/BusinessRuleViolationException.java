package com.codingshuttle.razorpay.common.exception;

import lombok.Getter;

@Getter
public class BusinessRuleViolationException extends RuntimeException {

    public final String errorCode;

    public BusinessRuleViolationException(String errorCode , String message) {
        super(message);
        this.errorCode = errorCode;
    }
}
