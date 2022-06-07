package com.neusoft.service.impl;

import com.neusoft.dao.UserDao;
import com.neusoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.neusoft.po.User;

/**
 * @Auther:某位不知名魔法少年
 * @ClassName:UserServiceImp1
 * @Date:2022/6/7 10:41
 * @功能描述:
 * @Version:1.0
 */
@Component("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser() {
        return userDao.getUser();
    }
}

