package com.edu.simple_patterns.abstruct_factory.website;

import com.edu.simple_patterns.abstruct_factory.Developer;
import com.edu.simple_patterns.abstruct_factory.ProjectManager;
import com.edu.simple_patterns.abstruct_factory.ProjectTeamFactory;
import com.edu.simple_patterns.abstruct_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePm();
    }
}
