package com.kismet.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Object proxyTarget;

    public void setProxyTarget(Object proxyTarget) {
        this.proxyTarget = proxyTarget;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                this.proxyTarget.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "方法被调用前");
        Object result = method.invoke(proxyTarget, args);
        System.out.println(method.getName() + "方法被调用后");
        return result;
    }
}
