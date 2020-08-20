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
           border:5px dashed red
         vertical-align:middle;
         height: 250px;
         width: 350px;
         
         }
          #a{
         font-size :20px
         font-weight:bold
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
<a id="a">修改密码</a>

原始密码：<input type="text" name="password1"id="password1"><br><br>
新密码：<input type="text" name="password2"id="password2"><br><br>
确定密码：<input type="text" name="password3"id="password3"><br><br>
<input type="button"value="提交" id="submit1">

</div>
</center>
</body>
</html>