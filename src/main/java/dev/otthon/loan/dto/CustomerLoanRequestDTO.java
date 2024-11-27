package dev.otthon.loan.dto;

import dev.otthon.loan.domain.Customer;

import java.math.BigDecimal;

public record CustomerLoanRequestDTO(
        Integer age,
        String cpf,
        String name,
        BigDecimal income,
        String location) {

    public Customer toEntity() {
        return new Customer(age, cpf, name, income, location);
    }

}
