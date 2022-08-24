package com.kismet.dao;

import com.kismet.pojo.User;
import com.kismet.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test() {
        try (SqlSession sqlSession = MyBatisUtils.getSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> allUserList = userMapper.getAllUserList();
            for (User user : allUserList) {
                System.out.println(user);
            }
        }
    }
}
