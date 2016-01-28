package com.cheng.weixin.dao;

import com.cheng.weixin.core.dao.UserDaoMapper;
import com.cheng.weixin.core.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Desc:
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public class TestMapper {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void before() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void getUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDaoMapper userDaoMapper = sqlSession.getMapper(UserDaoMapper.class);
        List<User> users = userDaoMapper.loadAll();
        System.out.println(users);
    }

}
