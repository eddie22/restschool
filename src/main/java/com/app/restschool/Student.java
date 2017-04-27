/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.restschool;

import java.util.UUID;

/**
 *
 * @author eddie
 */
public class Student {

    private UUID id;
    private String name;
    private String course;

    public Student() {
    }

    public Student(UUID id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", course=" + course + '}';
    }
    
    
    
}
