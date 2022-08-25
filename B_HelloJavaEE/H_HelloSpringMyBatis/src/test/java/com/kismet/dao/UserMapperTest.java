package com.kismet.dao;

import com.kismet.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");


//        SqlSessionFactory sqlSessionFactory = context.getBean("sqlSessionFactory", SqlSessionFactory.class);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

//        SqlSession sqlSession = context.getBean("sqlSession", SqlSession.class);
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

//        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        UserMapper userMapper = context.getBean("userMapperSupport", UserMapper.class);

        List<User> allUserList = userMapper.getAllUserList();
        for (User user : allUserList) {
            System.out.println(user);
        }
    }
}
