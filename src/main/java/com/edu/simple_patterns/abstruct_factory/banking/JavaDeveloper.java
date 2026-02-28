package com.edu.simple_patterns.abstruct_factory.banking;

import com.edu.simple_patterns.abstruct_factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer wrights java code...");
    }
}
