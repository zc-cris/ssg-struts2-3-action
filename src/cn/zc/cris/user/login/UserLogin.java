package cn.zc.cris.user.login;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

public class UserLogin implements SessionAware,ApplicationAware{
	//需要注入的属性,都是通过set方法进行注入，既有struts2框架自动注入，也有我们自己手工注入
	private Map<String, Object> application;
	private Map<String, Object> session;
	private String name;
	
	
	public String login() {
		//1.将登录用户名字放入session中，需要在页面进行显示
		this.session.put("name", this.name);
		
		//2.需要对application中的用户数量属性+1
		Integer count = (Integer) this.application.get("count");
		if(count == null || count <0) {
			count = 0;
		}
		count++;
		application.put("count", count);
		return "login-success";
	}
	
	public String logout() {
		//1. 将application中的count数量-1
		Integer count = (Integer) this.application.get("count");
		if(count > 0) {
			count--;
			this.application.put("count", count);
		}
		//2. 将当前session失效
		((SessionMap<String, Object>) session).invalidate();
		
		return "logout-success";
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public void setName(String name) {
		this.name = name;
	}
}
