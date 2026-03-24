package com.aksar.ecommerce.kafka;

import com.aksar.ecommerce.customer.CustomerResponse;
import com.aksar.ecommerce.order.PaymentMethod;
import com.aksar.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
