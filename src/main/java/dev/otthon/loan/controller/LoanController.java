package dev.otthon.loan.controller;

import dev.otthon.loan.dto.CustomerLoanRequestDTO;
import dev.otthon.loan.dto.CustomerLoanResponseDTO;
import dev.otthon.loan.service.LoanService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class LoanController {

    private final LoanService loanService;

    @PostMapping(value = "/customer-loans")
    public ResponseEntity<CustomerLoanResponseDTO> customerLoans(@RequestBody CustomerLoanRequestDTO request) {
       var loanResponse = loanService.checkLoanAvailability(request);
        return ResponseEntity.ok(loanResponse);
    }

}
