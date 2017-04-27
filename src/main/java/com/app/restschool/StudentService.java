/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.restschool;

import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author eddie
 */
@Path("student")
public class StudentService {

    CassandraConnection db = new CassandraConnection();

    public StudentService() {
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response addUser(Student student) {
        try {
            db.addStudent(student.getId(), student.getName(), student.getCourse());
            return Response.created(new URI("/" + student.getId().toString())).build();
        } catch (Exception ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Response.serverError().build();
    }
}
