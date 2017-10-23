<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	td{
		text-align:center;
	}
</style>
</head>
<body>
	<h2>班级信息列表</h2>
	<s:if test="#parameters.msg[0]==1">
		<p style="color:green">删除班级成功!</p>
	</s:if>
	<s:elseif test="#parameters.msg[0]==2">
		<p style="color:red">删除班级失败!</p>
	</s:elseif>
	<s:if test="#parameters.msg[0]==3">
		<p style="color:green">修改班级成功!</p>
	</s:if>
	<s:elseif test="#parameters.msg[0]==4">
		<p style="color:red">修改班级失败!</p>
	</s:elseif>
	<table border="1" width="600">
	<tr>
		<td>编号</td>
		<td>班级名称</td>
		<td>管理</td>
	</tr>
	<s:iterator value="#request.clsList" var="obj" status="ids">
	<tr>
		<td>${ids.count }</td>
		<td>${obj.cname }</td>
		<td>
			<a href="classAction_toUpdateClass?cls.cno=${obj.cno }">修改</a>&nbsp;|&nbsp;
			<a href="classAction_deleteClass?cls.cno=${obj.cno }">删除</a>
		</td>
	</tr>
	</s:iterator>
	</table>
	<a href="${pageContext.request.contextPath }/index.jsp">主页</a>
</body>
</html>

















