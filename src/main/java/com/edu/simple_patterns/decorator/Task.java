package com.edu.simple_patterns.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamlead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}
