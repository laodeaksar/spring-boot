package com.aksar.ecommerce.payment;

import com.aksar.ecommerce.customer.CustomerResponse;
import com.aksar.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
