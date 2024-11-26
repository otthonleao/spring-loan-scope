package dev.otthon.loan.dto;

import java.math.BigDecimal;

public record CustomerLoanRequestDTO(
        Integer age,
        String cpf,
        String name,
        BigDecimal income,
        String location) {
}
