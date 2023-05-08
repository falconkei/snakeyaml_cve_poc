package com.example.snakeyaml;
import java.util.*;

public class Student extends Person {
    private long id;
    private String department;
    private List<Course> courses;
    // Getters and setters
    public void setId(int newId) {
        this.id = newId;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }
    
    public void setCourses(List<Course> newCourses) {
        this.courses = newCourses;
    }

    public long getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public List<Course> getCourses() {
        return courses;
    }
}