package com.edu.simple_patterns.singletone2;

public class Director {
    private static volatile Director instance;
    private String sign;

    private Director(String sign) {
        this.sign = sign;
    }

    public static Director getInstance(String sign) {
        if (instance == null) {
            synchronized (Director.class) {
                if (instance == null) {
                    instance = new Director(sign);
                }
            }
        }
        return instance;
    }

    public void sign() {
        System.out.println(sign);
    }
}
