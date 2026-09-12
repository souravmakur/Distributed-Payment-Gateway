package com.codingshuttle.razorpay.merchant.service.impl;

import com.codingshuttle.razorpay.merchant.service.ApiKeyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/v1/merchants/{merchantId}/api-keys")
@RequiredArgsConstructor
public class ApiKeyServiceImpl implements ApiKeyService {
    private final ApiKeyService apiKeyService;

    @PostMapping
    public ResponseEntity<> create (@PathVariable UUID merchantId,
                                    @Valid @RequestBody CreateApiKeyRequest request) {

    }
}
