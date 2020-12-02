package chy.dao;


import lombok.Data;

@Data
public class TeacherDao {
    private int id;
    private String name;
    private Student student;
}
