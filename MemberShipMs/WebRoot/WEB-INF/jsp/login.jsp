<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<style>
         #add{
         background:green;
         vertical-align:middle;
         height: 250px;
         width: 350px;
         
         }
         h1{
         text-align:center 
               }
         #add{
         text-align:center 
         }      
</style>
<script type="text/javascript" src="statics/js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="statics/js/MemberShipMs.js"></script></head>
<body>
<center>
<div id="add">
<h1>商务会员管理系统</h1>
<form action="invsys/userlogin.html">
用户名：<input type="text" name="userName"id="userName"><br><br>
密码：<input type="text" name="password"id="password"><br><br>
<input type="button"value="登录" id="submit">
</form>
</div>
</center>
</body>
</html>