package com.edu.simple_patterns.example_nikiforov;

public class Main {
    public static void main(String[] args) {

        // Переменные
        int variable1 = 12;
        int variable2 = -5;
        int variable3 = -6;
        int variable4 = 50;

        int[] variableMassive = {variable1, variable2, variable3, variable4};
        float average;
        int temp = 0;
        for (int i = 0; i < variableMassive.length; i++) {
            temp += variableMassive[i];
            if (i == variableMassive.length - 1) {
                average = (float) temp / variableMassive.length;
                System.out.println(average);
            }
        }

        // Сложение строк
        String firstName = "Sergey";
        String lastName = "Doncov";
        int age = 40;
        String info = returnUserInformation(firstName, lastName, age);
        System.out.println(info);
    }

    static String returnUserInformation(String firstName, String lastName, int age) {
//        String info = firstName + ", " + lastName + ", " + age;
        String info = String.join(", ", firstName, lastName, String.valueOf(age));
        return info;
    }
}
