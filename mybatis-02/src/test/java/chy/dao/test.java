package chy.dao;

import chy.mapper.StudentMapper;
import chy.mapper.TeacherDaoMapper;
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

    @Test
    public void testTeacherDao() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherDaoMapper mapper = sqlSession.getMapper(TeacherDaoMapper.class);
        TeacherDao byId = mapper.getTeacherById(1);
        System.out.println(byId);
    }

    @Test
    public void testTeacher() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherDaoMapper mapper = sqlSession.getMapper(TeacherDaoMapper.class);
        List<TeacherDao> teacherDaoList = mapper.getTeacherDao();
        for (TeacherDao teacherDao : teacherDaoList) {
            System.out.println(teacherDao);

        }
    }
}
