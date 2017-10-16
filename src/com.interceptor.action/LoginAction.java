package com.interceptor.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Setter;

public class LoginAction extends ActionSupport {

	@Setter
	private String username;
	@Setter
	private String password;

	@Override
	public String execute() throws Exception {
		System.out.println("登录判断"); 
		System.out.println(username);

		//把登陆信息存储到session中
		ActionContext.getContext().getSession().put("USER_IN_SESSION", username);
		return SUCCESS;
	}
}
