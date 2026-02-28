package com.edu.simple_patterns.abstruct_factory.banking;

import com.edu.simple_patterns.abstruct_factory.Developer;
import com.edu.simple_patterns.abstruct_factory.ProjectManager;
import com.edu.simple_patterns.abstruct_factory.ProjectTeamFactory;
import com.edu.simple_patterns.abstruct_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QaTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
