package com.myshop.web.admin.Interceptor;

import com.myshop.domain.userentity.EmployeeEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor
{
    private static String LOGIN_CONTROLLER = "login";

    private static final String LOGINEMPLOYEESSION = "loginEmployeeSession";

    private static final Logger Debug = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception
    {
        Debug.debug("LoginInterceptor employee is start");

        EmployeeEntity employee = (EmployeeEntity) httpServletRequest.getSession().getAttribute(LOGINEMPLOYEESSION);

        if (null == employee)
        {
            Debug.debug("loginUser is null go to LOGIN_CONTROLLER" );

            httpServletResponse.sendRedirect(LOGIN_CONTROLLER);
        }

        Debug.debug("LoginInterceptor employee is end");

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
