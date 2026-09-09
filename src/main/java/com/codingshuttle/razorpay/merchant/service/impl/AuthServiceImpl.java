package com.codingshuttle.razorpay.merchant.service.impl;

import com.codingshuttle.razorpay.merchant.dto.request.MerchnantSignupRequest;
import com.codingshuttle.razorpay.merchant.dto.response.MerchantResponse;
import com.codingshuttle.razorpay.merchant.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//Why are we doing it like this, this is loose coupling. But why are we doing this ?
//We are doing it this way because our auth can change in the near future we might change it,
//so that is why we take an Interface and try to make different implementations as we move forward.

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthServiceImpl implements AuthService {

    @Override
    public MerchantResponse signup(MerchnantSignupRequest request) {
        return null;
    }
}
