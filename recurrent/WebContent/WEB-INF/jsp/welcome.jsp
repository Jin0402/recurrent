<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ようこそリカレント亭へ</title>
</head>
<body>
	<h6>Welcome to リ・カレント亭</h6>
	<div class="button_wrapper">
		<form action="/recurrent/WelcomeServlet?orderTypeId=1" method="post">
			<input type="submit" value="注文・メニューへ" class="button">
		</form>
	</div>
</body>
</html>