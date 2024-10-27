package com.haneeth.example;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
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

    @OneToOne(
            mappedBy = "student",
            cascade = CascadeType.ALL
    )
    private StudentProfile studentProfile;

    @ManyToOne
    @JoinColumn(
            name = "school_id"
    )
    @JsonBackReference
    private School school;

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

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
