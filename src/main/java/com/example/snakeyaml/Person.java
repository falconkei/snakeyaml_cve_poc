package com.example.snakeyaml;

public class Person {
    private int age;
    private String firstName;
    private String lastName;
    // Getters and setters

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setFirstName(String newFirst) {
        this.firstName = newFirst;
    }

    public void setLastName(String newLast) {
        this.lastName = newLast;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}