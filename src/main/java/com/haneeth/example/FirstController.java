package com.haneeth.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

// TO make this class a Controller
@RestController
public class FirstController {

    // Hello is end point
//    @GetMapping("/hello")
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    // Manually we are assigning a response status using HttpStatus enum class
//    public String sayHello(){
//        return "hello from Controller";
//    }

    @PostMapping("/post")
    public String post(
            @RequestBody String message
    ){
        return "Request accepted and message is :"+message ;
    }

    //  Using pojo here
    @PostMapping("/post-order")
    public String post(
            @RequestBody Order order
    ){
        return "Request accepted and message is :"+order.toString() ;
    }

    // using record here
    @PostMapping("/post-order-record")
    public String postRecord(
            @RequestBody OrderRecord order
    ){
        return "Request accepted and message is :"+order.toString() ;
    }

    // Uses this when value is part of url
    //Pass parameter to specific method
    @GetMapping("/hello/{user-name}")
    public String pathVar(
            @PathVariable("user-name") String userName
    ){
        return "my value = " + userName;
    }

    //Used to extract query_parameters here
    // http://localhost:8080/hello?user_name=paramvalue&user_lastname=value_2
    @GetMapping("/hello")
    public String paramVar(
            @RequestParam("user_name") String userName,
            @RequestParam("user_lastname") String userLastName
    ){
        return "my value ="+userName+" "+userLastName;
    }

}
