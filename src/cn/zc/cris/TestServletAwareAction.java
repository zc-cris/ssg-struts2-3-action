package cn.zc.cris;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;


public class TestServletAwareAction implements ServletContextAware,ServletRequestAware,ServletResponseAware{
	/**
	 * 通过实现servletXxxAware相关的接口的方式，可以由struts2注入需要的Servlet相关的对象
	 * 
	 * ServletContextAware：注入ServletContext对象（常用）
	 * ServletRequestAware：注入HttpServletRequest对象（常用）
	 * ServletResponseAware：注入HttpServletResponse对象
	 */
	private ServletContext context;
	@Override
	public void setServletContext(ServletContext context) {
		this.context = context;
	}
	
	public String execute() {
		System.out.println(context);
		return "success";
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
	}
}
