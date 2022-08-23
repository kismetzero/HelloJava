package com.kismet.anno.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Master {
    @Value("主人2号")
    private String name;
    @Value("20")
    private int age;
    private Dog dog;
    private Cat cat;

    public Master() {
        System.out.println("Master的无参构造被调用——注解创建");
    }

    public Master(String name, int age, Dog dog, Cat cat) {
        this.name = name;
        this.age = age;
        this.dog = dog;
        this.cat = cat;
    }

    @Autowired
    public Master(Dog dog, Cat cat) {
        this.dog = dog;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Master{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Master master = (Master) o;
        return age == master.age && Objects.equals(name, master.name) && Objects.equals(dog, master.dog) && Objects.equals(cat, master.cat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dog, cat);
    }
}
