package com.haneeth.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

// TO make this class a Controller
@RestController
public class FirstController {

    // Hello is end point
    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.ACCEPTED)
    // Manually we are assigning a response status using HttpStatus enum class
    public String sayHello(){
        return "hello from Controller";
    }

    @PostMapping("/post")
    public String post(
            String message
    ){
        return "Request accepted and message is :"+message ;
    }
}
