package com.kismet.jconf.auto;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MaserTest {
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(JConf.class);
        Master master = context.getBean("getMaster", Master.class);
        System.out.println(master);
    }
}
