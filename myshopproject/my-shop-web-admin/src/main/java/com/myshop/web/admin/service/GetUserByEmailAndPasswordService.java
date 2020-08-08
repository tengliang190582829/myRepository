package com.myshop.web.admin.service;

import com.myshop.domain.userentity.User;

public interface GetUserByEmailAndPasswordService
{
    public User login(User user);
}
