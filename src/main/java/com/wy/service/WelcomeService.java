package com.wy.service;

import com.wy.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ws")
public class WelcomeService {
    private String message ="hello~";

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }
@Resource(name="userDao")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello(){
        System.out.println(
                this.getMessage()
        );
        userDao.insert();
    }
}
