package chy.dao;

import chy.mapper.StudentMapper;
import chy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void testTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student byId = mapper.getById(1);
        System.out.println(byId);

    }

    @Test
    public void testTest2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> byId2 = mapper.getById2();
        System.out.println(byId2);
    }

}
