<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  

<%
	String path=request.getContextPath();
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>我的评论列表</title>
<script type="text/javascript" src="/resource/js/cms.js"></script>
</head>
<body>
	<table class="table" border="1" align="right">
		<tr>
			<td>编号</td>
			<td>文章标题</td>
			<td>用户</td>
			<td>评论内容</td>
			<td>评论时间</td>
		</tr>
		<c:forEach items="${clist }" var="c">
			<tr>
				<td>${c.id }</td>
				<td>${c.articleId }</td>
				<td>${c.userName }</td>
				<td>${c.content }</td>
				<td>${c.created }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>