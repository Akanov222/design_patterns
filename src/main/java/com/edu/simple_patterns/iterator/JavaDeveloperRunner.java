package com.edu.simple_patterns.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Maven", "PostgreSQL", "Hibernate", "Docker"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Brain Show", skills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
