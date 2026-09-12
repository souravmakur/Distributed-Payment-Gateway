package com.codingshuttle.razorpay.merchant.service.impl;

import com.codingshuttle.razorpay.common.exception.ResourceNotFoundException;
import com.codingshuttle.razorpay.merchant.dto.request.CreateApiKeyRequest;
import com.codingshuttle.razorpay.merchant.dto.response.ApiKeyCreateResponse;
import com.codingshuttle.razorpay.merchant.entity.Merchant;
import com.codingshuttle.razorpay.merchant.repository.MerchantRepository;
import com.codingshuttle.razorpay.merchant.service.ApiKeyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@Service
@RequiredArgsConstructor
@Slf4j
public class ApiKeyServiceImpl implements ApiKeyService {

    private final MerchantRepository merchantRepository;

    @Override
    public ApiKeyCreateResponse create(UUID merchantId , CreateApiKeyRequest request ) {
        Merchant merchant = merchantRepository.findById(merchantId)
                .orElseThrow(() -> new ResourceNotFoundException("merchant" , merchantId));

        String keyId = "rzp_" + request.enviroment().name().toUpperCase()+"big_random_string";
        String rawSecret = "big_random_string";

        return null;
    }
}