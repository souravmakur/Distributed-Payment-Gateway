package com.codingshuttle.razorpay.merchant.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "merchant_id")
    private Merchant merchant;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(nullable = false) //if we put unique = true here, then we are restricting our customers to only a few websites, a customer can pay to multiple merchants (H&M or zara)
    private String email;

    @Column(length = 20 , nullable = false)
    private String contactNumber;

    private LocalDateTime deletedAt;

}
