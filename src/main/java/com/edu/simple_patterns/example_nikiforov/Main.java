package com.edu.simple_patterns.example_nikiforov;

import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        int[][] model = new int[3][3];
        int number = 1;
        for (int i = 0; i < model[0].length; i++) {
            for (int j = 0; j < model.length; j++) {
                model[i][j] = number + 1;
                number++;
            }
        }
        System.out.println(model[model[0].length - 1][model.length - 1]);

    }

    public void setColor() {
        Color white = Color.WHITE;
        Color red = Color.RED;
        Color blue = Color.BLUE;
    }

    /*
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
    */

}
