<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%><%@include file="/WEB-INF/jsp/heden.jsp"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="statics/js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="statics/js/MemberShipMs.js"></script>
</head>
<body>
<center>
<form action="invsys/userlist.html" method="post">
		<input type="hidden" id="pageIndex" name="pageIndex" /> 
         <input type="text"name="NAME" id="NAME">
	    <input type="submit" value="搜索">
	</form>
	<table border="1" class="providerTable" cellpadding="0" cellspacing="0">
		<tr class="firstTr">
			<th>用户id</th>
			<th>用户名</th>
			<th>用户状态</th>
			<th>最后修改时间</th>
		</tr>
		<c:forEach var="list" items="${list}" varStatus="status">
			<tr>
				<td><span>${list.id }</span></td>
				<td><span>${list.NAME}</span></td>
				<td><span>${list.STATUS}</span></td>
				<td><fmt:formatDate value="${list.lastModifyTime}"
						pattern="yyyy-MM-dd" /></td>
			</tr>
		</c:forEach>
	</table>
	<ul>
		<li>共${page.totalCount }条记录&nbsp;&nbsp; ${page.currentPageNo
			}/${page.totalPageCount }页</li>
		<c:if test="${page.currentPageNo > 1}">
			<a href="javascript:page_nav(document.forms[0],1);">首页</a>
			<a href="javascript:page_nav(document.forms[0],${page.currentPageNo-1});">上一页</a>
		</c:if>
		<c:if test="${page.currentPageNo < page.totalPageCount }">
			<a href="javascript:page_nav(document.forms[0],${page.currentPageNo+1 });">下一页</a>
			<a href="javascript:page_nav(document.forms[0],${page.totalPageCount });">最后一页</a>
		</c:if>
	</ul>
	</center>
</body>
</html>