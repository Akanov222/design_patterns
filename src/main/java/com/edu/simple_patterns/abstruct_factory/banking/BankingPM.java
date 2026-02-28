package com.edu.simple_patterns.abstruct_factory.banking;

import com.edu.simple_patterns.abstruct_factory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageCode() {
        System.out.println("Banking PM manage banking project...");
    }
}
