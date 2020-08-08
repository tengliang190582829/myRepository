package com.myshop.web.admin.service;

import com.myshop.commons.utils.SpringContext;
import com.myshop.domain.userentity.User;
import com.myshop.web.admin.dao.GetUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GetUserByEmailAndPasswordImpl implements GetUserByEmailAndPasswordService
{
    private static final Logger LOG = Logger.getLogger(GetUserByEmailAndPasswordImpl.class);

    @Autowired
    private GetUserService getUserService;

    @Override
    public User login(User user)
    {
        LOG.debug("login is statt!");
        if (null == user)
        {
            LOG.debug("login user is null!");
            return null;
        }
        String email = user.getEmail();
        String password = user.getPassword();
        if (null == email || "" == email)
        {
            LOG.debug("login email is null!");
            return null;
        }
        if (null == password || "" == password)
        {
            LOG.debug("login password is null!");
            return null;
        }
        //GetUserService GetUserService = SpringContext.getBean("getUserService");
        User getuser = getUserService.getUser(user);
        if (email.equals(getuser.getEmail()))
        {
            if (password.equals(getuser.getPassword()))
            {
                return user;
            }
        }

        LOG.debug("login is statt!");

        return null;
    }
}
