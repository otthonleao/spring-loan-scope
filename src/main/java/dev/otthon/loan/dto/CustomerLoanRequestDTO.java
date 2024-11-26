package dev.otthon.loan.dto;

public record CustomerLoanRequestDTO(
        Integer age,
        String cpf,
        String name,
        Double income,
        String location) {
}
