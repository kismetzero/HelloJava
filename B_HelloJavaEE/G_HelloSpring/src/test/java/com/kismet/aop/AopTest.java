package com.kismet.aop;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
