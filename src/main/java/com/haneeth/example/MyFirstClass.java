package com.haneeth.example;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// Method 2
//@Component
//// Because we mentioned as Compenent spring will consider this as a bean
//public class MyFirstClass {
//    public String sayHello(){
//        return "saying hii";
//    }
//}

// Method 3
//@Service
//// We can also use Service because it extends component
//public class MyFirstClass {
//    public String sayHello(){
//        return "saying hii";
//    }
//}

// Method 4
//@Repository
// We can also use Repository because it extends component
public class MyFirstClass {
    public String sayHello(){
        return "saying hii";
    }
}