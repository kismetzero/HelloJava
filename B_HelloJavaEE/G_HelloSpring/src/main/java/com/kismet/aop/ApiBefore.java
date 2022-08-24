package com.kismet.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class ApiBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的"
                + method.getName() + "方法执行前" + "——api实现");
    }
}
