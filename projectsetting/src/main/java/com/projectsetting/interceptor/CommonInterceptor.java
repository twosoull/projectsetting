package com.projectsetting.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.projectsetting.controller.HomeController;

public class CommonInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/*
	 * 전처리기는 클라이언트에서 컨트롤러로 요청할 때 가로채는 것이다. 쉽게 말해 컨트롤러가 호출되기 전에 실행되는 메서드이다.
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info("Interceptor");
		logger.debug(" Request URI \t:  {}", request.getRequestURI());
		return super.preHandle(request, response, handler);
	}
	
	/*
	 * 후처리기는 컨트롤러에서 클라이언트로 요청할 때 가로채는 것이다. 쉽게 말해 컨트롤러가 호출되고 난 후에 실행되는 메서드이다.
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("Interceptor after");
		super.postHandle(request, response, handler, modelAndView);
	}
	
	/*
	 * 컨트롤러의 처리가 끝나고 화면처리까지 모두 끝나면 실행되는 메서드이다.
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

}
