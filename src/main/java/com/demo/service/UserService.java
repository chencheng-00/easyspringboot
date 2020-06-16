package com.demo.service;

import com.demo.entity.User;

public interface UserService {

    /**
     * 获取一条用户数据
     *
     * @param  userNo
     * @return User
     *
     */
    User get(String userNo);


    /**
     * 新增一条用户数据
     *
     * @param  user
     * @return User
     *
     */
    void addUser(User user);

}

