package com.edu.simple_patterns.abstruct_factory.website;

import com.edu.simple_patterns.abstruct_factory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer wrights php code...");
    }
}
