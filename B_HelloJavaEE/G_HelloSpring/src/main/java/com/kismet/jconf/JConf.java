package com.kismet.jconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JConf {
    @Bean
    public Person getPerson() {
        Person person = new Person();
        person.setName("王五");
        person.setAge(22);
        return person;
    }
}
