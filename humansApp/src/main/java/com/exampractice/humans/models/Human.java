package com.exampractice.humans.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Human {
    private String firstName;
    private String lastName;
    private String location;
    private int age;
    private String gender;

    public Human(String firstName, String lastName, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
    }

    public Human(String firstName, String lastName, String location, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.age = age;
        this.gender = gender;
    }
}
