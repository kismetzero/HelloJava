package com.kismet.anno.auto;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MaserTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("anno.xml");
        Master master = context.getBean("master", Master.class);
        System.out.println(master);
    }
}
