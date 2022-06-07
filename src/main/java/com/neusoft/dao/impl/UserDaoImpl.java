package com.neusoft.dao.impl;

import com.neusoft.dao.UserDao;
import org.springframework.stereotype.Component;
import com.neusoft.po.User;

/**
 * @Auther:某位不知名魔法少年
 * @ClassName:UserDaoImp1
 * @Date:2022/6/7 10:37
 * @功能描述:
 * @Version:1.0
 */
@Component
public class UserDaoImpl implements UserDao {
    @Override
    public User getUser(){
        return new User(1,"test","111");
    }
}
