package com.kismet.proxy;

import org.junit.Test;

public class ProxyTest {
    @Test
    public void test() {
        ProxyInvocationHandler pin = new ProxyInvocationHandler();
        UserService userService = new UserServiceImpl();
        pin.setProxyTarget(userService);
        UserService proxy = (UserService) pin.getProxy();
        proxy.add();
    }
}
