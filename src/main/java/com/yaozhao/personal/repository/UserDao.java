package com.yaozhao.personal.repository;

import com.yaozhao.personal.model.Users;

public interface UserDao {
    boolean save(Users u);
    int update(Users u);
    int delete(long id);
    Users getUser(long id);
    Users getUser(String name);
}
