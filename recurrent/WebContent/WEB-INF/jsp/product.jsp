<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html lang="ja">

<head>
	<%@ include file="../include/include_meta.jsp" %>
	<title>商品詳細画面</title>
	<jsp:include page="../include/include_css.jsp" />
</head>
<body>
	<div class="container">
		<%@ include file="../include/include_header.jsp" %>
		<div class="row wrapper">
			<%@ include file="../include/mode_nav.jsp" %>
			<main class="main">
				<div class="row">
					<div class="col-sm-10 main">
						<div class="row">
							<div class="image-wrapper">
								<img src="images/setmenu/<c:out value="${product.image }"/>" alt="<c:out value="${product.productName }" />" class="img-thumbnail" />
							</div>
							<div class="product-detail-wrapper">
								<h3 class="a"><c:out value="${product.productName }" /></h3>
								<div class="row">
									<p><c:out value="${product.price }"/>円</p>
									<p><c:out value="${product.calorie }"/>カロリー</p>
								</div>
								<form action="/recurrent/CartServlet<c:if test="${change=='change'}">?action=confirm</c:if>" method="post">
									<input type="hidden" name="typeCode" value="<c:out value="${product.typeCode }"/>" />
									<input type="hidden" name="productName" value="<c:out value="${product.productName }"/>" />
									<input type="hidden" name="price" value="<c:out value="${product.price }"/>" />
									<input type="hidden" name="calorie" value="<c:out value="${product.calorie }"/>" />
									<input type="hidden" name="image" value="<c:out value="${product.image }"/>" />
									<input type="hidden" name="orderTypeId" value="<c:out value="${orderTypeId }"/>" />
									<p>数量：<input type="number" name="quantity" value="1" min="1" max="20" requied /></p>
									<input type="submit" value="${button }" class="button" />
									<!--  <a href="javascript:history.back()">戻る</a> -->
								</form>
								<c:if test="${change=='change'}">
									<form action="/recurrent/CartServlet<c:if test="${change=='change'}">?action=confirm</c:if>" method="post">									<input type="hidden" name="quantity" value="1"/>
										<input type="hidden" name="delete" value="delete" />
										<input type="submit" value="商品取消" class="button" />
									</form>
								</c:if>
							</div>
						</div>
					</div>
				</div>
			</main>
		</div>
	</div>
	<%@ include file="../include/bootstrap_script.jsp" %>
</body>
</html>