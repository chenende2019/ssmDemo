package com.alibaba.ssmDemo.dao;

import com.alibaba.ssmDemo.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    User findUserById(int id);
    int insert(@Param("entry") User user);
}
