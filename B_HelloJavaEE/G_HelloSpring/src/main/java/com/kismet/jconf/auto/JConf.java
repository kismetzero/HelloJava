package com.kismet.jconf.auto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JConf {
    @Bean
    public Master getMaster() {
        Dog dog = new Dog("狗狗3号", 5);
        Cat cat = new Cat("猫猫3号", 6);
        Master master = new Master("主人3号", 22, dog, cat);
        return master;
    }
}
