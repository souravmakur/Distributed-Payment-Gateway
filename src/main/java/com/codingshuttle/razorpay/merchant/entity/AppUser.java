package com.codingshuttle.razorpay.merchant.entity;

import com.codingshuttle.razorpay.common.enums.UserRole;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "app_user")
public class AppUser {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY) //Many appUsers can be  merchant
    @JoinColumn(name = "merchant_id")
    private Merchant merchant;

    @Column(unique = true , nullable = false)
    private String email;

    @Column(nullable = false)
    private String passwordHash;


    private UserRole role;

}
