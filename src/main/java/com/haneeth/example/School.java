package com.haneeth.example;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class School {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;


    @OneToMany(
            mappedBy = "school"
    )
    @JsonManagedReference
    private List<Student> students;


    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // Since for entity constructor is mandatory
    public School(){

    }

    // Setter and getters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }
}
