package com.kismet.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnoDiyAop {
    @Before("execution(* com.kismet.aop.UserServiceImpl.*(..))")
    public void annoBefore() {
        System.out.println("=== 方法执行前（注解实现） ===");
    }

    @After("execution(* com.kismet.aop.UserServiceImpl.*(..))")
    public void annoAfter() {
        System.out.println("=== 方法执行后（注解实现） ===");
    }

    @Around("execution(* com.kismet.aop.UserServiceImpl.*(..))")
    public void annoAround(ProceedingJoinPoint joinPoint) {
        System.out.println("=== 环绕前（注解实现） ===");
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("=== 环绕后（注解实现） ===");
    }
}
