package com.aksar.ecommerce.customer;

import org.springframework.validation.annotation.Validated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Setter
@Getter
@Validated
public class Address {
    private String street;
    private String homeNumber;
    private String zipCode;
}
