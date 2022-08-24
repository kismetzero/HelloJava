package com.kismet.aop;

public class DiyClassAop {
    public void diyBefore() {
        System.out.println("=== 方法执行前（自定义类实现） ===");
    }

    public void diyAfter() {
        System.out.println("=== 方法执行后（自定义类实现） ===");
    }
}
