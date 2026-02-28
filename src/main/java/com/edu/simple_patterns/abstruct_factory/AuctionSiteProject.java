package com.edu.simple_patterns.abstruct_factory;

import com.edu.simple_patterns.abstruct_factory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory webTeamFactory = new WebsiteTeamFactory();
        Developer websiteDeveloper = webTeamFactory.getDeveloper();
        Tester websiteTester = webTeamFactory.getTester();
        ProjectManager websiteProjectManager = webTeamFactory.getProjectManager();

        System.out.println("Creating website...");
        websiteDeveloper.writeCode();
        websiteTester.testCode();
        websiteProjectManager.manageCode();
    }
}
