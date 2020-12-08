<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="ja">

<head>
<%@ include file="../include/include_meta.jsp"%>
<title>>リ・カレント亭</title>
<%@ include file="../include/include_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@ include file="../include/include_header.jsp" %>
		<%@ include file="../include/mode_nav.jsp" %>
		<main class="main">
			<h3>注文内容の確認</h3>
			<div class="row">
				<c:set var="totalPrice" value="0" />
				<c:set var="totalCalorie" value="0" />
				<c:forEach var="li" items="${orders.orders }">
					<c:set var="totalPrice" value="${ totalPrice + li.price }" />
					<c:set var="totalCalorie" value="${ totalCalorie + li.calorie }" />
				</c:forEach>
				<table>
					<tr>
						<th>合計金額</th>
					</tr>
					<tr>
						<td><c:out value="${ totalPrice }" />円</td>
					</tr>
				</table>
				<table>
					<tr>
						<th>合計カロリー</th>
					</tr>
					<tr>
						<td><c:out value="${ totalCalorie }" />カロリー</td>
					</tr>
				</table>
				<div class="col-sm-10">
					<div class="button_wrapper">
						<form action="/recurrent/OrderServlet" method="post">
							<table>
								<tr>
									<th>ご注文商品</th>
									<th>数量</th>
									<th>金額</th>
									<th>カロリー</th>
									<th>ご注文方法</th>
								</tr>
								<c:forEach var="list" items="${orders.orders }" varStatus="status">
									<tr>
										<td><a href="/recurrent/CartServlet?ordersNum=${status.index} "><c:out value="${list.productName }" /></a></td>
										<td><c:out value="${list.quantity }" /></td>
										<td><c:out value="${list.price }" /></td>
										<td><c:out value="${list.calorie }" /></td>
										<td><c:out value="${list.ordertypeId }" /></td>
										<td><button onclick="location.href='/recurrent/CartServlet?ordersNum=${status.index}'">数量変更</button></td>
									</tr>
								</c:forEach>
							</table>
							<input type="submit" value="注文を確定する" class="button">
						</form>
					</div>
				</div>
			</div>
		</main>
	</div>
	<%@ include file="../include/bootstrap_script.jsp" %>
</body>
</html>