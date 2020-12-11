<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>座席選択画面</title>
</head>
<body>

	<p>注文管理</p>
	<a href="/recurrent/LoginServlet">トップへ戻る</a>
	<p>座席を指定してください</p>
	<table border="1" style="border-collapse: collapse">
		<tr>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=1">1</a></td>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=2">2</a></td>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=3">3</a></td>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=4">4</a></td>
		</tr>

		<tr>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=5">5</a></td>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=6">6</a></td>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=7">7</a></td>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=8">8</a></td>
		</tr>
		<tr>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=9">9</a></td>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=10">10</a></td>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=11">11</a></td>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=12">12</a></td>
		</tr>
		<tr>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=13">13</a></td>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=14">14</a></td>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=15">15</a></td>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=16">16</a></td>
		</tr>
		<tr>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=17">17</a></td>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=18">18</a></td>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=19">19</a></td>
			<td><a href="/recurrent/ConfirmOrderServlet?seat=20">20</a></td>
		</tr>
	</table>


	<a href="/recurrent/ConfirmLoginServlet">ログアウト</a>
</body>
</html>