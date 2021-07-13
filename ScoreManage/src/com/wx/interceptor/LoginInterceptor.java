package com.wx.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.wx.po.*;

/**
 * 登录拦截器
 * @author asus
 *
 */
public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modleAndView)
			throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		String url = request.getRequestURI();
		//url:除了login。jsp是可以直接访问的，其他的都要拦截
		if (url.indexOf("/login")>=0) {
			return true;
		}
		//获取session
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("USER_SESSION");
		if(user !=null) {
			return true;
		}
		//不符合条件的给出提示，并且跳转到登录页面
		request.setAttribute("msg", "您还没有登录，请先登录");
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		return false;
		
	}

}
