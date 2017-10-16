package com.interceptor.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

//登陆检查拦截器
public class CheckLoginInterceptor extends AbstractInterceptor {
	//执行拦截操作
	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		System.out.println("登陆检查拦截器");
		Map<String, Object> sessionMap = actionInvocation.getInvocationContext().getSession();
		Object user = sessionMap.get("USER_IN_SESSION");
		if(user == null){
			return "login";//返回login逻辑视图 重新定向到login.jsp
			//return Action.login;
		}
		return actionInvocation.invoke();//放行去执行action
	}
}
