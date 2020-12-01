package chy.mapper;

import chy.dao.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    Student getById(@Param("id") int id);

    List<Student> getById2();

}
