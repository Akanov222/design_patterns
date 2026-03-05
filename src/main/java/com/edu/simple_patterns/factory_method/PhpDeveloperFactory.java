package com.edu.simple_patterns.factory_method;

public class PhpDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
