package com.codingshuttle.razorpay.merchant.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "merchant_webhook_config")
public class MerchantWebhookConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name ="merchant_id" , nullable = false)
    private Merchant merchant;

    @Column(nullable = false, length = 500)
    private String targetUrl; //targetUrl is for

    @Column(length = 255)
    private String webhookSecretHash; //we sign the webhook wth this and we and merchant knows about it, that's how we know that the payload is coming from actual razor pay

    @Column(nullable = false)
    private Boolean enabled = true;

    @Column(length = 255)
    private String eventTypes;
}
