package com.codingshuttle.razorpay.common.exception;


import lombok.Getter;

@Getter
public class DuplicateResourceException extends RuntimeException{

    private final String errorCode;

    public DuplicateResourceException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
}


//WE CAN MAKE OUR OWN EXCEPTIONS THO ALOT OF EXCEPTIONS ARE ALREADY THERE IN JPA