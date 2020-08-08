package com.myshop.web.admin.controller;

import com.myshop.commons.utils.CookieUtils;
import com.myshop.commons.utils.SubSringUntil;
import com.myshop.domain.userentity.EmployeeEntity;
import com.myshop.domain.userentity.User;
import com.myshop.web.admin.service.GetUserByEmailAndPasswordService;
import com.myshop.web.admin.service.employeelogin.EmployeeLoginByEmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController
{
    private static String LOGIN_PAGE = "login";

    private static final int COOKIEMAXAGE = 30*12*24*60*60*1000;

    private static final String ENCODESTRING = "UTF-8";

    private static final String LOGINEMPLOYEESSION = "loginEmployeeSession";

    private static final String LOGINU_COOKE = "loginUserCookie";

    private static final int ZERO = 0;

    public static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private EmployeeLoginByEmailService employeeLoginByEmailService;

    private EmployeeEntity employeeEntity = null;

    private EmployeeEntity getEmployeeinfo;

    @RequestMapping(value = {"login"}, method = RequestMethod.GET)
    public String login(String email, String password,
                        HttpServletRequest request, Model model)
    {
        logger.debug( "loginController login is start.");
        model.addAttribute("loginRespMessage", "");

        String retValue  = CookieUtils.getCookieValue(request, LOGINU_COOKE, ENCODESTRING);
        String[] subString = SubSringUntil.getSubSringUntil(retValue, ":");
        if(null != subString && subString.length > ZERO)
        {
            String employeeEmail = subString[0];
            String employeepassword = subString[1];
            getEmployeeinfo = employeeLoginByEmailService.EmployeeLoginByEmail(employeeEmail);
            if (null != getEmployeeinfo)
            {
                String qryPassword = getEmployeeinfo.getPassword();
                if (null != employeepassword && employeepassword.equals(qryPassword))
                {
                    logger.debug( "loginController is go to main page!");
                    return "redirect:/main";
                }
            }
            else
            {
                return LOGIN_PAGE;
            }
        }

        logger.debug( "loginController is go to login page!");
        return LOGIN_PAGE;
    }

    @RequestMapping(value ={"", "login"}, method = RequestMethod.POST)
    public String login(@RequestParam(required = true) String email, @RequestParam String password, String isCheckbox,
                        HttpServletRequest request, HttpServletResponse response, Model model)
    {
        logger.debug( "loginController login is start!");

        getEmployeeinfo = employeeLoginByEmailService.EmployeeLoginByEmail(email);
        if (null != getEmployeeinfo)
        {
            String qryPassword = getEmployeeinfo.getPassword();
            if (password.equals(qryPassword))
            {
                if (null != isCheckbox)
                {
                    // 登录的用户信息存入cook
                    String cookieValue = getEmployeeinfo.getEmployeeEmail()+ ":"+ getEmployeeinfo.getPassword();
                    CookieUtils.setCookie(request, response, LOGINU_COOKE, cookieValue, COOKIEMAXAGE, ENCODESTRING);
                    logger.debug( "loginController login is success!");
                }
                logger.debug( "loginController is go to main page!");
                request.getSession().setAttribute(LOGINEMPLOYEESSION, getEmployeeinfo);

                return "redirect:/main";
            }
        }
        else
        {
            model.addAttribute("loginRespMessage", "登陆邮箱或者密码错误.");
        }

        logger.debug( "loginController login is error!");
        return LOGIN_PAGE;
    }
}
