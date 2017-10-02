package de.brainwork.javaTimer;

import javax.ejb.Stateless;

@Stateless
public class HelloService {
    public String sayHello(){
        return "Hello from control: " + System.currentTimeMillis();
    }
}