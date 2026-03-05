package com.edu.simple_patterns.factory_method;

public class CppDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
