package com.kismet.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("anno.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
}
