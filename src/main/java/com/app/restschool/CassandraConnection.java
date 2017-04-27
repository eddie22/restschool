/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.restschool;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import java.util.UUID;

/**
 *
 * @author eddie
 */
public class CassandraConnection {
    
    Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
    Session session = cluster.connect("dev");
    
    public void addStudent(UUID id, String name, String course) {
        session.execute("insert into students (id, name, course) values (?, ?, ?)", id, name, course);
    }
}
