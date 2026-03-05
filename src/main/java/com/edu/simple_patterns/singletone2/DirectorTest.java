package com.edu.simple_patterns.singletone2;

public class DirectorTest {
    public static void main(String[] args) {
        Director director1 = Director.getInstance("111");
        director1.sign();

        Director director2 = Director.getInstance("222");
        director2.sign();

        Director director3 = Director.getInstance("333");
        director3.sign();
    }
}
