package com.nextepisode137.sfgdemo;

import org.springframework.stereotype.Component;

@Component
public class MyController {

    public String sayHello(){
        System.out.println("hello world");

        return "Hi im your daddy";
    }
}
