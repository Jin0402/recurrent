<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>注文確認画面</title>
</head>
<body>
	<a href="/recurrent/LoginServlet">トップへ戻る</a>
	<p>注文確認</p>
	<p><c:out value="${seat}"/>番テーブル</p>

	<!-- 注文がない場合 -->
	<c:if test="${empty result}">
		<p>注文はありません</p>
	</c:if>

	<!-- 注文がある場合 -->
	<c:if test="${not empty result}">
		<table border="1">
			<tr>
				<th>注文日</th>
				<th>品名</th>
				<th>金額</th>
				<th>カロリー</th>
				<th>数量</th>
				<th>品目</th>
				<th>品種</th>
				<th>注文方法</th>
			</tr>
			<c:forEach var="confirmResult" items="${result.managerSlips}">
				<tr>
					<td><c:out value="${confirmResult.orderDate}"/></td>
					<td><c:out value="${confirmResult.productName}"/></td>
					<td><c:out value="${confirmResult.price}"/></td>
					<td><c:out value="${confirmResult.calorie}"/></td>
					<td><c:out value="${confirmResult.quantity}"/></td>
					<td><c:out value="${confirmResult.item}"/></td>
					<td><c:out value="${confirmResult.variety}"/></td>
					<td><c:out value="${confirmResult.orderType}"/></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

	<a href="/recurrent/ConfirmOrderServlet">席再選択</a>
	<a href="/recurrent/ConfirmLoginServlet">ログアウト</a>
</body>
</html>