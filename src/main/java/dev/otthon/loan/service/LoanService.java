package dev.otthon.loan.service;

import dev.otthon.loan.domain.Loan;
import dev.otthon.loan.domain.LoanType;
import dev.otthon.loan.dto.CustomerLoanRequestDTO;
import dev.otthon.loan.dto.CustomerLoanResponseDTO;
import dev.otthon.loan.dto.LoanResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    public CustomerLoanResponseDTO checkLoanAvailability(CustomerLoanRequestDTO loanRequestDTO) {

        var customer = loanRequestDTO.toEntity();
        var loan = new Loan(customer);

        List<LoanResponseDTO> loans = new ArrayList<>();

        if (loan.isPersonalLoanAvailable()) {
            loans.add(new LoanResponseDTO(LoanType.PERSONAL, loan.getPersonalLoanInterestRate()));
        }
        if (loan.isPayrollLoanAvailable()) {
            loans.add(new LoanResponseDTO(LoanType.GUARANTEED, loan.getPayrollLoanInterestRate()));
        }

        return new CustomerLoanResponseDTO(loanRequestDTO.name(), loans);
    }

}
