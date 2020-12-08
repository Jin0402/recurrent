<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>アカウント管理画面</title>
</head>
<body>
	<a href="/recurrent/LoginServlet">トップへ戻る</a>
	<p>アカウント管理画面</p>
	<p>修正・削除するアカウントの管理者IDを選択してください</p>
	<table border="1">
		<tr>
			<td>店舗</td>
			<td>名前</td>
			<td>管理者ID</td>
		</tr>
		<tr>
			<td>●●</td>
			<td>●●●●</td>
			<td><a href=>管理者ID（仮）</a></td>
		</tr>
	</table>
	<a href="/recurrent/AccountRegistrationServlet">新規登録</a>
	<a href="/recurrent/ConfirmLoginServlet">ログアウト</a>
</body>
</html>