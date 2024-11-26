package dev.otthon.loan.dto;

import java.util.List;

public record CustomerLoanResponseDTO(
        String customer,
        List<LoanResponseDTO> loans
) {
}
