<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
</head>
<body>
	<h2>修改学生</h2>
	<s:if test="#parameters.msg[0]==1">
		<p style="color:green">修改学生成功!</p>
	</s:if>
	<s:elseif test="#parameters.msg[0]==-1">
		<p style="color:red">修改学生失败!</p>
	</s:elseif>
	<s:form method="post" action="stuAction_doUpdateStu">
		<s:hidden name="stu.sno"/>
		学生姓名:<s:textfield name="stu.sname"/><br/>
		学生年龄:<s:textfield name="stu.sage"/><br/>
		学生性别:<s:radio list="{'男','女'}" name="stu.ssex"/><br/>
		入学时间:<s:textfield name="stu.sintime"/><br/>
		<select name="stu.cls.cno">
			<option value="">请选择班级</option>
		</select><br>
		<s:submit value="修改学生"/>
	</s:form>
	<a href="${pageContext.request.contextPath }/stuAction_findStuList">查询学生信息列表</a>
</body>
<script type="text/javascript">
$(function(){
	//取出所有可选的班级
	$(":input[name='stu.cls.cno'] option:not(:first)").remove();
	$.post("stuAction_findClassList","",function(data){
		$.each(data.clsList,function(i,v){
			var option="<option value='"+v.cno+"'>"+v.cname+"</option>";
			$("select:eq(0)").append(option);
		});
		$("select:eq(0) option[value='${stu.cls.cno}']").attr("selected",true);
	},"json");
});
</script>
</html>

















