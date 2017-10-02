package de.brainwork.kotlinTimer

import javax.ejb.Schedule
import javax.ejb.Singleton
import javax.ejb.Stateless
import javax.inject.Inject

@Singleton
class TimerService @Inject constructor(
        val helloService: HelloService){

    @Schedule(second="*/1", minute="*",hour="*", persistent=false)
    fun doWork() {
        println("timer: ${helloService.sayHello()}");
    }
}


@Stateless
class HelloService {

    fun sayHello(): String {
        return "Hello3 from control: ${System.currentTimeMillis()}"
    }
}