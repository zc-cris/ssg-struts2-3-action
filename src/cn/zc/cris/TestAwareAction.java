package cn.zc.cris;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;

public class TestAwareAction implements ApplicationAware{

	private Map<String, Object> applicationMap = null;
	
	public String execute() {
		applicationMap.put("applicationKey2", "applicationValue2");
		
		return "success";
	}
	
	//由struts2框架自动调用（注入模式）
	@Override
	public void setApplication(Map<String, Object> application) {
		this.applicationMap = application;
	}
}
