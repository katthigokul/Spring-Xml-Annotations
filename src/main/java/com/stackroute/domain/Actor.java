package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {

    @Value("23")
    private int age;
    @Value("NTR")
    private String name;
    @Value("Male")
    private String gender;


    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ",age=" + age +

                '}';
    }
}
