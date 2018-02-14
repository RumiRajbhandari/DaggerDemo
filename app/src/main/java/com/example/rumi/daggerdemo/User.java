package com.example.rumi.daggerdemo;

import javax.inject.Inject;

/**
 * Created by rumi on 2/14/18.
 */

public class User {
    public String name;
    public String location;

    @Inject
    public User(){

    }
    public User(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
