package com.kismet.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTTest {
    @Test
    public void userTTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AnnoContext.xml");
    }
}
