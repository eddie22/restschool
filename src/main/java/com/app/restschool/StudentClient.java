/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.restschool;

import java.util.UUID;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author eddie
 */
public class StudentClient {
    Client client = ClientBuilder.newClient();
    
    public static void main(String [] args) {
        StudentClient sc = new StudentClient();
        System.out.println(sc.addStudent());
    }
    
    public String addStudent() {
        Student student = new Student(UUID.randomUUID(), "test name", "test course");
        Response response = client.target("http://localhost:8080/restschool/resources/student").request().post(Entity.entity(student, MediaType.APPLICATION_JSON));
        return Integer.toString(response.getStatus());
    }
}
