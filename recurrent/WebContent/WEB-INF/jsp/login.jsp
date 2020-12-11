<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>管理トップ画面</title>
</head>
<body>
	<p><c:out value="${store.storeName}"/>ログインしました</p>
	<a href="/recurrent/ConfirmOrderServlet">注文管理</a>
	<a href="/recurrent/SalesServlet?action=login">売上管理</a>
	<a href="/recurrent/AccountServlet?action=login">アカウント管理</a>
	<a href="/recurrent/MenuServlet?action=login">メニュー管理</a>
	<a href="/recurrent/ConfirmLoginServlet?action=login">ログアウト</a>
</body>
</html>