package chy.mapper;

import chy.dao.TeacherDao;

import java.util.List;

public interface TeacherDaoMapper {
    TeacherDao getTeacherById(int id);

    List<TeacherDao> getTeacherDao();
}
