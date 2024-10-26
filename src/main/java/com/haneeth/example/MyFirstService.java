package com.haneeth.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private MyFirstClass myFirstClass;


    // Special Spring beans It gives all data related to environment
    // It can also read any property written in our property file
    private Environment environment;

    // To inject value into variables from external sources like property file,environment variable,system property
    @Value("${my.custom.property}")
    private String name;

    @Autowired // It is written at constructor level so that spring will know to do bean injection
    public MyFirstService(MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }

    // Setter injection for Environment;
    @Autowired
    public void setEnvironment(Environment environment){
        this.environment = environment;
    }

    public String getJavaVersion(){
        return environment.getProperty("java.version");
    }

    public String getOs(){
        return environment.getProperty("os.name");
    }

    // It can also read any property written in our property file
    public String getProperty(){
        return environment.getProperty("my.custom.property");
    }


    public String tellAsStory(){
        return "The dependency is saying: "+myFirstClass.sayHello()+" "+name;
    }
}