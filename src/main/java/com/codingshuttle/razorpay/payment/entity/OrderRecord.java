package com.codingshuttle.razorpay.payment.entity;

import com.codingshuttle.razorpay.common.entity.Money;
import com.codingshuttle.razorpay.common.enums.OrderStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name = "order_record")
public class OrderRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "merchant_id", nullable = false)
    private UUID merchantId;

    @Embedded
    private Money amount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private OrderStatus orderStatus = OrderStatus.CREATED;

    @Column(nullable = false)
    private Integer attempts = 0;

    @JdbcTypeCode((SqlTypes.JSON)) //this will help us to convert the json code that is getting stored into the db as a map.
    @Column(columnDefinition = "jsonb")  //for Integer or String, we do not need 'columnDefinition' but for special inputs such as json we have to
    private Map<String, Object> notes; //Notes are sent by the user in Key value pairs so that is why we will be using JSON

    @Column(nullable = false)
    private LocalDateTime expiresAt;
}
