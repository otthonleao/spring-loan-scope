package dev.otthon.loan.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Customer {

    private Integer age;
    private String cpf;
    private String name;
    private BigDecimal income;
    private String location;

    public boolean isIncomeEqualOrLowerThan(BigDecimal value) {
        return income.compareTo(value) <= 0;
    }

    public boolean isIncomeEqualOrGraterThan(BigDecimal value) {
        return income.compareTo(value) >= 0;
    }

    public boolean isAgeBetween(int min, int max) {
        return age >= min && age <= max;
    }

    boolean isIncomeBetween(BigDecimal min, BigDecimal max) {
        return income.compareTo(min) >= 0 && income.compareTo(max) <= 0;
    }

    boolean isCustomerLocation(String location) {
        return this.location.equalsIgnoreCase(location);
    }
}
