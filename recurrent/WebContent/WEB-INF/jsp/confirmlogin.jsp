<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ログイン画面</title>
</head>
<body>

	<form action="/recurrent/LoginServlet" method="post">
		管理者ID:
		<input type="text" name="id"><br>

		パスワード:
		<input type="text" name="pass"><br>
		<br><br><br>


		<input type="submit" value="ログイン">
	</form>
</body>
</html>