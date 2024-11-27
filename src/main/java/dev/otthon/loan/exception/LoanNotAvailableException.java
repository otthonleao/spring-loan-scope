package dev.otthon.loan.exception;

public class LoanNotAvailableException extends RuntimeException {

    public LoanNotAvailableException(String message) {
        super(message);
    }

}
