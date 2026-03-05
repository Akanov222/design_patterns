package com.edu.simple_patterns.factory_method;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        developer.wrightCode();

        DeveloperFactory developerFactory2 = createDeveloperBySpeciality("cpp");
        Developer developer2 = developerFactory2.createDeveloper();
        developer2.wrightCode();

        DeveloperFactory developerFactory3 = createDeveloperBySpeciality("php");
        Developer developer3 = developerFactory3.createDeveloper();
        developer3.wrightCode();

        DeveloperFactory developerFactory4 = createDeveloperBySpeciality("js");
        Developer developer4 = developerFactory4.createDeveloper();
        developer4.wrightCode();

    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality");
        }
    }
}
