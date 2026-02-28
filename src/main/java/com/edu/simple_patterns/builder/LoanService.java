package com.edu.simple_patterns.builder;

public class LoanService {
    public static void main(String[] args) {
        CreditApplication app = new CreditApplication
                .Builder("4500-123456", 500000.0)
                .withEmployer("GreenBank")
                .withCreditScore(750)
                .withCollateral(true)
                .build();
        System.out.println("Заявка создана для человека, номер паспорта: " + app.getPassportNumber());

        System.out.println("Детали заявки: " +
                "\n-банк: " + app.getEmployerName() +
                "\n-кредитный рейтинг заемщика: " + app.getCreditScore() +
                "\n-залог: " + app.getHasCollateral()
        );
    }
}
