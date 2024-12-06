package org.example.springbootdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //tells sprint to create and manage objects of alien class
public class Alien {

    @Value("25")//puts default value
    private int age;

    private Computer com;

    public int getAge() {
        return age;
    }

    public Computer getCom() {
        return com;
    }
    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        com.compile();
        System.out.println("Coding..");
    }
}
