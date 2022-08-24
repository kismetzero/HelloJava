package com.kismet.aop;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加了用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了用户");
    }

    @Override
    public void update() {
        System.out.println("更新了用户");
    }

    @Override
    public void query() {
        System.out.println("查询了用户");
    }
}
