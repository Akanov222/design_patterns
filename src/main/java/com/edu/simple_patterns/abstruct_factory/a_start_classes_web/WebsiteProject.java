package com.edu.simple_patterns.abstruct_factory.a_start_classes_web;

class WebsiteProject {
    public static void main(String[] args) {
        PhpDeveloperWeb phpDeveloperWeb = new PhpDeveloperWeb();
        ManualTesterWeb manualTesterWeb = new ManualTesterWeb();
        ProjectManegerWeb projectManegerWeb = new ProjectManegerWeb();

        System.out.println("Creating project...");
        phpDeveloperWeb.wrightCode();
        manualTesterWeb.testCode();
        projectManegerWeb.manageProject();
    }
}
