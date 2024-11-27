package dev.otthon.loan.dto;

import dev.otthon.loan.domain.Customer;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import java.math.BigDecimal;

public record CustomerLoanRequestDTO(
        @Min(18) @NotNull Integer age,
        @CPF String cpf,
        @NotBlank String name,
        @Min(1400) @NotNull BigDecimal income,
        @NotBlank String location) {

    public Customer toEntity() {
        return new Customer(age, cpf, name, income, location);
    }

}
