package dev.otthon.loan.domain;

import dev.otthon.loan.exception.LoanNotAvailableException;
import dev.otthon.loan.shared.InterestRate;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Loan {

    private Customer customer;

    public boolean isPersonalLoanAvailable() {
        if (customer.isIncomeEqualOrLowerThan(new BigDecimal(3000))) {
            return true;
        }

        return customer.isAgeBetween(18, 30)
                && customer.isIncomeBetween(new BigDecimal(3000), new BigDecimal(5000))
                && customer.isCustomerLocation("SP");
    }

    public boolean isPayrollLoanAvailable() {
        return customer.isIncomeEqualOrGraterThan(new BigDecimal(5000));
    }

    public double getPersonalLoanInterestRate() {
        if (isPersonalLoanAvailable()) {
            return InterestRate.PERSONAL_LOAN;
        }
        throw new LoanNotAvailableException("Personal loan not available for this customer");
    }

    public double getPayrollLoanInterestRate() {
        if (isPayrollLoanAvailable()) {
            return InterestRate.PAYROLL_LOAN;
        }
        throw new LoanNotAvailableException("Payroll loan not available for this customer");
    }

}
