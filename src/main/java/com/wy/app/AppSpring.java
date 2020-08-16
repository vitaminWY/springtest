package com.wy.app;

import com.wy.service.WelcomeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext sc = new ClassPathXmlApplicationContext("beans.xml");
        WelcomeService ws = sc.getBean("ws", WelcomeService.class);
        ws.sayHello();
    }
}
