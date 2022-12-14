package com.kismet.dao;

import com.kismet.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> getAllUserList() {
        return sqlSession.getMapper(UserMapper.class).getAllUserList();
    }
}
