<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加学生</title>
</head>
<body>
<%
request.setAttribute("name","1221");
%>


	<form action="/myWeb/addStudent" method="get">

		学生姓名：<input type = "text" name = "studentName" />  <br/>
		学生性别：男 <input type = "radio" name = "studnetSex" value="0" /> 女 <input type = "radio" name = "studnetSex" value="1"/>  <br/>
		学生年龄：<input type = "text" name = "age" />  <br/>
		学生电话：<input type = "text" name = "mobile" />  <br/>
		学生地址：<input type = "text" name = "address" />  <br/>
		学生邮箱：<input type = "text" name = "mail" />  <br/>

		<input type ="submit" value="添加">


	</form>

</body>
</html>