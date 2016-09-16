package com.tt.service;

import com.tt.dao.UserDao;
import com.tt.model.User;

/**
 * Created by lx7ly on 9/16/16.
 */
public class UserService {

    private UserDao userDao;


    public void register(User user) {
        userDao.addUser(user);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
