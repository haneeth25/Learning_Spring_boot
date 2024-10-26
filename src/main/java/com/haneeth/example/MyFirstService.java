package com.haneeth.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    // Field injection -- for this @AutoWired is mandatory
    // @Autowired
    // @Qualifier("myFirstClass")  // Even though we have given primary for bean still we can use qualifier to get exact bean
    private MyFirstClass myFirstClass;

    // This is constructor injection.
    // It is not mandatory to use autowired keyword
    //@Autowired // It is written at constructor level so that spring will know to do bean injection
//    public MyFirstService(@Qualifier("bean2") MyFirstClass myFirstClass){
//        this.myFirstClass = myFirstClass;
//    }

    // We can also do using dependecy injection using setter
    @Autowired
    public void setFirstClass(MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }

//        public MyFirstService(MyFirstClass myFirstClass){
//        this.myFirstClass = myFirstClass;
//    }
    public String tellAsStory(){
        return "The dependency is saying: "+myFirstClass.sayHello();
    }
}