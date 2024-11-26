package dev.otthon.loan.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LoanType {
    PERSONAL(0),
    GUARANTEED(1),
    CONSIGNMENT(2);

    private int code;

    public static LoanType valueOf(int codeReceived) {
        for (LoanType value : LoanType.values()) {
            if (value.getCode() == codeReceived) {
                return value;
            }
        }
        throw new IllegalArgumentException(String.format("Loan Type Code: %d not found or invalid", codeReceived));
    }

}
