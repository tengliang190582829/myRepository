package com.myshop.web.admin.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.myshop.domain.userentity.EmployeeEntity;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptorOtherLogin implements HandlerInterceptor
{
	private static final String LOGINEMPLOYEESSION = "loginEmployeeSession";

	private static String MAIN_CONTROLLER = "main";

	private static String LOGIN_PAGE = "login";

	private static final Logger Debug = LoggerFactory.getLogger(LoginInterceptorOtherLogin.class);

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		Debug.debug("LoginInterceptorOtherLogin is return true");

		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		Debug.debug("LoginInterceptorOtherLogin modelAndView:" + modelAndView);

		if(modelAndView != null && modelAndView.getViewName().endsWith(LOGIN_PAGE)) {
			EmployeeEntity employee = (EmployeeEntity)request.getSession().getAttribute(LOGINEMPLOYEESSION);
			if(null != employee) {
				response.sendRedirect(MAIN_CONTROLLER);
				Debug.debug("LoginInterceptorOtherLogin go to main controller");
			}
		}
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
}
