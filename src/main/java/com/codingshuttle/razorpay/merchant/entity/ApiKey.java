package com.codingshuttle.razorpay.merchant.entity;

import com.codingshuttle.razorpay.common.enums.Environment;
import jakarta.persistence.*;

import java.util.UUID;

public class ApiKey {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "merchant_id", nullable = false)
    private Merchant merchant;

    @Column(nullable = false , length = 50)
    private String keyId;

    @Column(nullable = false , length = 200)
    private String keySecretHash;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private Environment environment;

    @Column(nullable = false)
    private boolean enabled = true;

    private java.time.LocalDateTime createdAt;
    private java.time.LocalDateTime lastUsedAt;
    private java.time.LocalDateTime updatedAt;
}
