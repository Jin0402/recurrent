<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html lang="ja">

<head>
	<%@ include file="../include/include_meta.jsp" %>
	<title>>リ・カレント亭</title>
	<%@ include file="../include/include_css.jsp" %>
</head>
<body>
	<div class="container">
		<%@ include file="../include/include_header.jsp" %>

	<main>
				<div class="row">
			<jsp:include page="/WEB-INF/include/menuButton.jsp" />
			<div class="col-sm-10 main">

				<a href="/recurrent/PlayServlet?action=gatya"><p
						class="text-sm-center">もう１回ガチャる！！</p></a>

				<form action="/recurrent/CartServlet" method="post">
					<input type="submit" value="カートに入れる" class="button" />
				</form>
			</div>
		</div>
		<jsp:include page="/WEB-INF/include/margin.jsp" />
	</main>
	</div>
  <%@ include file="../include/bootstrap_script.jsp" %>
</body>
</html>