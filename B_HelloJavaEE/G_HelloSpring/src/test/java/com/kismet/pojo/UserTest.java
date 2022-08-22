package com.kismet.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");
        System.out.println(context.getBean("user",User.class).toString());
    }
}
