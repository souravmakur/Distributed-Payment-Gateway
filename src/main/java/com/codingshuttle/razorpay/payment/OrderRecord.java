package com.codingshuttle.razorpay.payment;

import com.codingshuttle.razorpay.common.entity.Money;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "order_record")
public class OrderRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "merchant__id", nullable = false)
    private UUID merchantId;

    @Embedded
    private Money amount;

}
