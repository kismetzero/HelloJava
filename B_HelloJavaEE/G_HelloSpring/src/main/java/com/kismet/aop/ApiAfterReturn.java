package com.kismet.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class ApiAfterReturn implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName()
                + "方法执行后，执行结果为：" + returnValue + "——api实现");
    }
}
