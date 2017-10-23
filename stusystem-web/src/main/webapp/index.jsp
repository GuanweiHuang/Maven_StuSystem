<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
</head>
<body>
	<h1>首页</h1>
	<hr/>	
	<h2>班级管理</h2>
	
	<a href="pages/addPages/addClass.jsp">添加班级</a><br/>
	<a href="classAction_findClassList">查询班级</a><br/>
	
	<hr/>
	
	<h2>学生管理</h2>
	
	<a href="pages/addPages/addStu.jsp">添加学生</a><br/>
	<a href="stuAction_findStuList">查询学生</a><br/>
	
	<hr/>
</body>
</html>