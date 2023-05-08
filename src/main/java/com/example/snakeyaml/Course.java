package com.example.snakeyaml;

public class Course {
    private String name;
    private double credits;
    // Getters and setters

    public void setName(String newName) {
        this.name = newName;
    }

    public void setCredits(double newCredits) {
        this.credits = newCredits;
    }

    public String getName() {
        return name;
    }

    public double getCredits() {
        return credits;
    }
}