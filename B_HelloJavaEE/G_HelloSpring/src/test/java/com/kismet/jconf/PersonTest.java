package com.kismet.jconf;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonTest {
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(JConf.class);
        Person person = context.getBean("getPerson", Person.class);
        System.out.println(person);
    }
}
