<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt"
      uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>

<html lang="ja">

<head>
	<%@ include file="../include/include_meta.jsp" %>
	<title>カート</title>
	<jsp:include page="../include/include_css.jsp" />
	<link rel="stylesheet" href="css/cart.css">
</head>

<body>
	<div class="container">
		<%@ include file="../include/include_header.jsp" %>
		<div class="row wrapper">
			<%@ include file="../include/mode_nav.jsp" %>
			<main class="main">
				<h3>注文内容の確認</h3>
				<div class="cart-wrapper">
					<div class="row justify-content-between">
						<c:set var="quantityPrice" value="0" />
						<c:set var="jquantityCalorie" value="0" />
						<c:set var="totalPrice" value="0" />
						<c:set var="totalCalorie" value="0" />
						<c:forEach var="li" items="${orders.orders }">
							<c:set var="quantityPrice" value="${li.price * li.quantity }"/>
							<c:set var="quantityCalorie" value="${li.calorie * li.quantity }"/>
							<c:set var="totalPrice" value="${ totalPrice + quantityPrice }" />
							<c:set var="totalCalorie" value="${ totalCalorie + quantityCalorie }" />
						</c:forEach>
						<fmt:formatNumber var="price" value="${totalPrice }" groupingUsed="true" maxFractionDigits="0"/>
						<fmt:formatNumber var="calorie" value="${totalCalorie }" groupingUsed="true" maxFractionDigits="0"/>
						<div class="col-4">
							<table class="text-center">
								<tr>
									<th>合計金額</th>
								</tr>
								<tr>
									<td><c:out value="${ price }" />円</td>
								</tr>
							</table>
						</div>
						<div class="col-4">
							<table class="text-center">
								<tr>
									<th>合計カロリー</th>
								</tr>
								<tr>
									<td><c:out value="${ calorie }" />カロリー</td>
								</tr>
							</table>
						</div>
					</div>
					<div class="cart-form-wrapper">
						<form action="/recurrent/OrderServlet" method="post" class="form">
							<table class="cart-form-table">
								<tr>
									<th>商品</th>
									<th>数量</th>
									<th>金額</th>
									<th>カロリー</th>
								</tr>
								<c:set var="quantityPrice" value="0" />
								<c:set var="jquantityCalorie" value="0" />
								<c:forEach var="list" items="${orders.orders }" varStatus="status">
									<c:set var="quantityPrice" value="${list.price * list.quantity }"/>
									<c:set var="quantityCalorie" value="${list.calorie * list.quantity }"/>
									<fmt:formatNumber var="price" value="${quantityPrice }" groupingUsed="true" maxFractionDigits="0"/>
									<fmt:formatNumber var="calorie" value="${quantityCalorie }" groupingUsed="true" maxFractionDigits="0"/>
									<tr>
										<td class="product-name"><c:out value="${list.productName }" /></td>
										<td><c:out value="${list.quantity }" /></td>
										<td class="price"><c:out value="${price }" /></td>
										<td><c:out value="${calorie }" /></td>
										<td class="table-button"><a href="/recurrent/CartServlet?ordersNum=${status.index}">変更</a></td>
									</tr>
								</c:forEach>
							</table>
							<input type="submit" value="注文を確定する" class="button">
						</form>
					</div>
				</div>
			</main>
		</div>
	</div>
	<%@ include file="../include/bootstrap_script.jsp" %>
</body>

</html>