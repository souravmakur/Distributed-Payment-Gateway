package com.codingshuttle.razorpay.merchant.service;

import com.codingshuttle.razorpay.merchant.dto.request.MerchnantSignupRequest;
import com.codingshuttle.razorpay.merchant.dto.response.MerchantResponse;

public interface AuthService {
    MerchantResponse signup(MerchnantSignupRequest request);
}
