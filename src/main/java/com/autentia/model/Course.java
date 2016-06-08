package com.autentia.model;

import java.io.Serializable;

/**
 * Created by jorgepacheco on 3/6/16.
 */
public class Course implements Serializable{


    private final String name;

    private final Integer credits;


    public Course(String name, Integer credits) {
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public Integer getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                '}';
    }
}
