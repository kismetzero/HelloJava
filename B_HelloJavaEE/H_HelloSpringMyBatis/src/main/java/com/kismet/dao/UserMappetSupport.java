package com.kismet.dao;

import com.kismet.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMappetSupport extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> getAllUserList() {
        return getSqlSession().getMapper(UserMapper.class).getAllUserList();
    }
}
