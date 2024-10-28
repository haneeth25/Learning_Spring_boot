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

    public Student toStudent(StudentDto studentDto){
        var student = new Student();
        student.setFirstname(studentDto.getFirstname());
        student.setLastname(studentDto.getLastname());
        student.setAge(studentDto.getAge());
        var school = new School();
        school.setId(studentDto.getId());
        student.setSchool(school);
        return student;
    }
    public StudentResponseDto toStudentResponseDto(Student student){
        var studentResponseDto = new StudentResponseDto();
        studentResponseDto.setFirstname(student.getFirstname());
        studentResponseDto.setLastname(student.getLastname());
        studentResponseDto.setAge(student.getAge());
        return studentResponseDto;
    }


    // Create
    @PostMapping("/students")
    public StudentResponseDto post(
            @RequestBody StudentDto studentDto
    ){
        var student = toStudent(studentDto);
        var response = repository.save(student);
        return toStudentResponseDto(response);
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
