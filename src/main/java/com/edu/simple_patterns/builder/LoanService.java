package com.edu.simple_patterns.builder;

import org.springframework.stereotype.Service;

@Service
public class LoanService {
    public void creatLoan() {
        CreditApplication app = new CreditApplication
                .Builder("4500-123456", 500000.0)
                .withEmployer("GreenBank")
                .withCreditScore(750)
                .withCollateral(true)
                .build();
        System.out.println("Заявка создана для паспорта: " + app.getPassportNumber());
    }
}
