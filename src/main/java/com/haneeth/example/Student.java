package com.haneeth.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToUrl;

// To make it a table
@Entity
@Table(name = "T_STUDENT")
public class Student {

    // TO make it primary key
    @Id
    @GeneratedValue
    private Integer id;
    private String firstname;
    private String lastname;
    private int age;

    public Student(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
