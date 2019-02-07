package com.alibaba.ssmDemo.dao;

import com.alibaba.ssmDemo.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    // 根据 id 寻找对应的 User
    User findUserById(int id);
    int insert(@Param("entry") User user);
}
