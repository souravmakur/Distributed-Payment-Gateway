package com.codingshuttle.razorpay.common.exception;

public class DuplicateResourceException extends RuntimeException {

    private final String errorCode;

    public DuplicateResourceException(String message) {
    super(message);
    this.errorCode = message;
    }
}

//WE CAN MAKE OUR OWN EXCEPTIONS THO ALOT OF EXCEPTIONS ARE ALREADY THERE IN JPA