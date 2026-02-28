package com.edu.simple_patterns.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditApplication {

    // обязательные поля
    private final String passportNumber;
    private final double requestedAmount;

    // опциональные поля
    private final String employerName;
    private final Integer creditScore;
    private final Boolean hasCollateral;

    private CreditApplication(Builder builder) {
        this.passportNumber = builder.passportNumber;
        this.requestedAmount = builder.requestedAmount;
        this.employerName = builder.employerName;
        this.creditScore = builder.creditScore;
        this.hasCollateral = builder.hasCollateral;
    }

    public static class Builder {
        private String passportNumber;
        private double requestedAmount;

        private String employerName;
        private Integer creditScore = 0;
        private Boolean hasCollateral = false;

        public Builder(String passportNumber, double requestedAmount) {
            this.passportNumber = passportNumber;
            this.requestedAmount = requestedAmount;
        }

        public Builder withEmployer(String employerName) {
            this.employerName = employerName;
            return this;
        }

        public Builder withCreditScore(Integer creditScore) {
            this.creditScore = creditScore;
            return this;
        }

        public Builder withCollateral(Boolean hasCollateral) {
            this.hasCollateral = hasCollateral;
            return this;
        }

        public CreditApplication build() {
            return new CreditApplication(this);
        }
    }
}
