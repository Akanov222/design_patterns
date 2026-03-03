package com.edu.simple_patterns.decorator;

public class JavaTeamlead extends DeveloperDecorator{
    public JavaTeamlead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Teamlead sends week report for customer. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
