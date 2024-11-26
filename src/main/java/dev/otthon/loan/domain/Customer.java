package dev.otthon.loan.domain;

import lombok.AllArgsConstructor;
import java.math.BigDecimal;

@AllArgsConstructor
public class Customer {

    private Integer age;
    private String cpf;
    private String name;
    private BigDecimal income;
    private String location;
}
