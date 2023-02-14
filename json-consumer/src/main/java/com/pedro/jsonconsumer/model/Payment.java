package com.pedro.jsonconsumer.model;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Getter
public class Payment implements Serializable {
    private Long id;
    private Long idClient;
    private Long idProduct;
    private String cardNumber;


}
