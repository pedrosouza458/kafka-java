package com.pedro.paymentservice.model;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Payment implements Serializable {
    private Long id;
    private Long idClient;
    private Long idProduct;
    private String cardNumber;


}
