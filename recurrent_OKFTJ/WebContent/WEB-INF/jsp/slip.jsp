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

				<p></p>
				<p></p>
				<h3>
					<p class="text-sm-center">伝票</p>
				</h3>


				<h3>
					<a href="/recurrent/SlipServlet?action=kaikei"><p
							class="text-sm-center">会計</p></a>
				</h3>
			</div>
		</div>
		<jsp:include page="/WEB-INF/include/margin.jsp" />
	</main>
	</div>
  <%@ include file="../include/bootstrap_script.jsp" %>
</body>
</html>