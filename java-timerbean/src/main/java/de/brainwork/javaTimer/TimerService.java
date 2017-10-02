package de.brainwork.javaTimer;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Singleton;

@Singleton(name = "MyTimerService")
public class TimerService {
    @EJB
    HelloService helloService;

    @Schedule(second="*/1", minute="*",hour="*", persistent=false)
    public void doWork(){
        System.out.println("timer: " + helloService.sayHello());
    }
}
