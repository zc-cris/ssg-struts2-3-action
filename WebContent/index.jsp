<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="testActionContext.action?name=james">test ActionContext</a>
	<br><br>
	<a href="testAware.action">test Aware</a>
	<br><br>
	<a href="testServletActionContext.action">test ServletActionContext</a>
	<br><br>
	<a href="testServletAware.action">test servetAware</a>
	<br><br>
	<a href="user-loginUI.do">user loginUI</a>
	<br><br>
	<a href="TestResultAction.action?num=4">test result</a>
	
	<a href="userAction-query">user query</a>
	<br><br>
	<a href="userAction-delete">user delete</a>
	<br><br>
	<a href="userAction-add">user add</a>
	<br><br>
	<a href="userAction-update">user update</a>

	<%
		if(session.getAttribute("date") == null)
		session.setAttribute("date", new Date());	
	
		//request.setAttribute("key", "value");
	%>
</body>
</html>