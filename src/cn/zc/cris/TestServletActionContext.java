package cn.zc.cris;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class TestServletActionContext {
	
	public String execute() {
		/**
		 * ServletActionContext:可以从中获取到当前Action对象需要的一切Servlet API相关的对象
		 * 常用的方法：
		 * 1. 获取HttpServletRequest：ServletActionContext.getRequest()
		 * 2. 获取HttpSession：ServletActionContext.getRequest().getSession()
		 * 3. 获取servletContext：ServletActionContext.getServletContext()
		 * 
		 */
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		ServletContext servletContext = ServletActionContext.getServletContext();
		System.out.println(request);
		System.out.println(session);
		System.out.println(servletContext);
		
		return "success";
	}
}
