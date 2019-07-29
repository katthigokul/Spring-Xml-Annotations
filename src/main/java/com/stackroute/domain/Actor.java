package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
    private String name;
    private String gender;
    private int age;

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    @Value("${actor.name}")
    public void setName(String name) {
        this.name = name;
    }

    @Value("${actor.gender}")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Value("${actor.age}")
    public void setAge(int age) {
        this.age = age;

    }
}