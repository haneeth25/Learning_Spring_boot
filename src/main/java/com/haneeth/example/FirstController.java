package com.haneeth.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// TO make this class a Controller
@RestController
public class FirstController {

    private final StudentRepository repository;

    // We are using constructor injection here
    public FirstController(StudentRepository repository) {
        this.repository = repository;
    }

    // Create
    @PostMapping("/students")
    public Student post(
            @RequestBody Student student
    ){
        return repository.save(student);
    }
    // Read
    @GetMapping("/students")
    public List<Student> allStudents(){
        return repository.findAll();
    }

    //Read
    @GetMapping("/students/{student-id}")
    public Student findById(
            @PathVariable("student-id") Integer id
    ){
        return repository.findById(id).orElse(null);
    }

    @GetMapping("/students/search/{student-name}")
    public List<Student> findByName(
            @PathVariable("student-name")  String name
    ){
        return repository.findAllByFirstnameContaining(name);
    }

}
