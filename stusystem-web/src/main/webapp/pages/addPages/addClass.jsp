<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>添加班级</h2>
	<s:if test="#parameters.msg[0]==1">
		<p style="color:green">添加班级成功!</p>
	</s:if>
	<s:elseif test="#parameters.msg[0]==2">
		<p style="color:red">添加班级失败!</p>
	</s:elseif>
	<s:form method="post" action="classAction_doAddClass">
	班级名称:<s:textfield name="cls.cname"/><br/>
		<s:submit value="添加班级"/>
	</s:form>
	<a href="${pageContext.request.contextPath }/index.jsp" onclick="testOne()">首页</a>
</body>
</html>
















