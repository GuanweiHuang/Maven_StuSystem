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
		text-align: center;
	}
</style>
</head>
<body>
	<h2>学生信息列表</h2>
	<s:if test="#parameters.msg[0]==2">
		<p style="color:green">删除学生成功!</p>
	</s:if>
	<s:elseif test="#parameters.msg[0]==-2">
		<p style="color:red">删除学生失败!</p>
	</s:elseif>
	<s:if test="#parameters.msg[0]==3">
		<p style="color:green">修改学生成功!</p>
	</s:if>
	<s:elseif test="#parameters.msg[0]==-3">
		<p style="color:red">修改学生失败!</p>
	</s:elseif>
	<table border="1" width="800">
	<tr>
		<td>学生编号</td>
		<td>学生姓名</td>
		<td>学生年龄</td>
		<td>学生性别</td>
		<td>入学时间</td>
		<td>所在班级</td>
		<td>管理</td>
	</tr>
	<s:iterator value="#request.stuList" var="obj" status="ids">
	<tr>
		<td>${ids.count }</td>
		<td>${obj[0].sname }</td>
		<td>${obj[0].sage }</td>
		<td>${obj[0].ssex }</td>
		<td>${obj[0].sintime.toString().substring(0,10) }</td>
		<td>${obj[1].cname }</td>
		<td>
			<a href="stuAction_toUpdateStu?stu.sno=${obj[0].sno }">修改</a>&nbsp;|&nbsp;
			<a href="stuAction_deleteStu?stu.sno=${obj[0].sno }">删除</a>
		</td>
	</tr>
	</s:iterator>
	</table>
	<a href="${pageContext.request.contextPath }/index.jsp">主页</a>
</body>
</html>















