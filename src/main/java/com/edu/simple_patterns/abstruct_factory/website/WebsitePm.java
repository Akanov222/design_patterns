package com.edu.simple_patterns.abstruct_factory.website;

import com.edu.simple_patterns.abstruct_factory.ProjectManager;

public class WebsitePm implements ProjectManager {
    @Override
    public void manageCode() {
        System.out.println("PM websites manages website project...");
    }
}
