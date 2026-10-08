package com.codingshuttle.razorpay.payment.mapper;

import com.codingshuttle.razorpay.payment.dto.response.PaymentResponse;
import com.codingshuttle.razorpay.payment.entity.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PaymentMapper {

    //convert Payment Object to Payment response object
    @Mapping(target = "orderId", source = "order.id") //Paymwnt has a field named order and in OrderRecord we have a field called Id so we are mapping them together
    PaymentResponse toResponse(Payment payment);
    //target --> toResponse     source is order.id

    @Mapping(target = "orderId" , source = "order.id")
    List<PaymentResponse> toResponseList(List<Payment> paymentList);
}
