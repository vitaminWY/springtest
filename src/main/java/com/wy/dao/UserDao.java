package com.wy.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {

    public void insert(){
        System.out.println("insert over");
    }
}
