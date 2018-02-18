package cn.zc.cris;

import java.util.Map;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.dispatcher.Parameter;
import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionContext;

public class TestActionContextAction {
	
	@SuppressWarnings("unchecked")
	public String execute() {
		
		//0.获取ActionContext对象
		//actionContext是Action的上下文对象，可以从中获取到当前Action需要的一切信息
		ActionContext actionContext = ActionContext.getContext();
		
		//1.获取application对应的map，并向其中添加一个属性
		Map<String, Object> applicationMap = actionContext.getApplication();
		applicationMap.put("applicationKey", "applicationValue");
		
		//2.session
		Map<String, Object> sessionMap = actionContext.getSession();
		sessionMap.put("sessionKey", "sessionValue");
		Object date = sessionMap.get("date");
		System.out.println(date);
		
		if(sessionMap instanceof SessionMap) {
			SessionMap<String, Object> sm = (SessionMap<String, Object>) sessionMap;
			sm.invalidate();
			System.out.println("session失效了");
		}
		
		//3.request*
		//ActionContext中并没有直接获取getRequest方法来获取request对应的map
		//需要手工的调用get方法并且传入request字符串参数来进行获取
		Map<String, Object> requestMap = (Map<String, Object>) actionContext.get("request");
		requestMap.put("requestKey", "requestValue");
		
		//4.获取请求参数对应的map，并获取指定的值
		//键：请求参数的名字；值：请求参数对应的Parameter,可以直接打印出来
		HttpParameters parameters = actionContext.getParameters();
		Parameter name = parameters.get("name");
		System.out.println(name);			//james
				
		return "success";
	}
}
