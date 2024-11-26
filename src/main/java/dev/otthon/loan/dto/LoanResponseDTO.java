package dev.otthon.loan.dto;

import dev.otthon.loan.domain.LoanType;

public record LoanResponseDTO(
        LoanType type,
        Double interestRate
) {
}
