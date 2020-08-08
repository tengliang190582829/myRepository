package com.myshop.web.admin.dao;

import com.myshop.domain.userentity.User;
import org.springframework.stereotype.Repository;

@Repository
public class GetUserImpl implements GetUserService
{
    @Override
    public User getUser(User user) {
        user.setEmail("123456@qq.com");
        user.setPassword("123");

        return user;
    }
}
