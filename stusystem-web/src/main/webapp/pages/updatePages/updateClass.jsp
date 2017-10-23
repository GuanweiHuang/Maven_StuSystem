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
	<h2>修改班级</h2>
	<s:form method="post" action="classAction_doUpdateClass">
	<s:hidden name="cls.cno" />
	班级名称:<s:textfield name="cls.cname"/><br/>
		<s:submit value="修改班级"/>
	</s:form>
	<a href="${pageContext.request.contextPath }/classAction_findClassList">查询班级信息</a>
</body>
</html>