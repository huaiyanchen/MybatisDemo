package com.chy.dao;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    int  addUser(User user);

    int updateUser(User user);

    void deleteUser(int id);
}
