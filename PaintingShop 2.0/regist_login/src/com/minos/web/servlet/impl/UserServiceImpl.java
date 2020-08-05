package com.minos.web.servlet.impl;

import com.minos.domain.User;
import com.minos.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public void regist(List<User> userList, User user) {
        //保存用户信息
        userList.add(user);
    }
}
