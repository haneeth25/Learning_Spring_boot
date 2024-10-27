package com.haneeth.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Since we extend JpaRepository spring knows that it is a bean no need to add repository here.
public interface StudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findAllByFirstnameContaining(String h);

}
