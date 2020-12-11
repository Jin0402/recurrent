<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>
	<meta charset="UTF-8">
	<title>推定エネルギー計算画面</title>
</head>

<body>
	<div class="container">
		<div class="row">

			<div class="col-sm-10 main">
				<c:choose>
					<c:when test="${action=='done'}">
						<!--エネルギー計算結果画面 -->

						<h2>推定エネルギー計算結果画面</h2>
						<p>あなたの「1日に必要なエネルギー必要量」をしらべてみましょう</p>
						<form action="/recurrent/EnergyServlet?action=done" method="post">
							<div>性別：
								<select name="gender" required>
									<option value="" disabled>選択してください</option>
									<option value="1" <c:if test="${Energy.genderId=='1'}">selected</c:if>>女</option>
									<option value="2" <c:if test="${Energy.genderId=='2'}">selected</c:if>>男</option>
								</select>
							</div>
							<div>年齢：
								<select name="age" required>
									<option value="" disabled>選択してください</option>
									<!-- <option value="1">18～29</option>
									<option value="2">30～49</option>
									<option value="3">50～69</option>
									<option value="4">70～120</option> -->
									<option value="1" <c:if test="${Energy.ageId=='1'}">selected</c:if>>18～29</option>
									<option value="2" <c:if test="${Energy.ageId=='2'}">selected</c:if>>30～49</option>
									<option value="3" <c:if test="${Energy.ageId=='3'}">selected</c:if>>50～69</option>
									<option value="4" <c:if test="${Energy.ageId=='4'}">selected</c:if>>70～120</option>
								</select>
							</div>
							<div>身体活動レベル：
								<select name="level" required>
									<option value="" disabled>選択してください</option>
									<!-- <option value="1">レベル１</option>
									<option value="2">レベル２</option>
									<option value="3">レベル３</option> -->
									<option value="1" <c:if test="${Energy.levelId=='1'}">selected</c:if>>レベル１</option>
									<option value="2" <c:if test="${Energy.levelId=='2'}">selected</c:if>>レベル２</option>
									<option value="3" <c:if test="${Energy.levelId=='3'}">selected</c:if>>レベル３</option>
								</select>
 							</div>
							<input type="submit" value="しらべる"/>
						</form>
						<a href="/recurrent/EnergyServlet">リセット</a>
						<h2>あなたの「1日に必要なエネルギー必要量」のめやすです</h2>
						<p><c:out value="${energy.energy}" />kcal</p>
						<!-- エネルギー結果ここまで -->
					</c:when>
					<c:otherwise>
					<!-- エネルギー計算画面 -->
					<h2>推定エネルギー計算画面</h2>
					<p>あなたの「1日に必要なエネルギー必要量」をしらべてみましょう</p>
					<form action="/recurrent/EnergyServlet?action=done" method="post">
						<div>性別：
							<select name="gender" required>
								<option value="" disabled selected>選択してください</option>
								<option value="1">女</option>
								<option value="2">男</option>
							</select>
						</div>
						<div>年齢：
							<select name="age" required>
								<option value="" disabled selected>選択してください</option>
								<option value="1">18～29</option>
								<option value="2">30～49</option>
								<option value="3">50～69</option>
								<option value="4">70～120</option>
							</select>
						</div>
						<div>身体活動レベル：
							<select name="level" required>
								<option value="" disabled selected>選択してください</option>
								<option value="1">レベル１</option>
								<option value="2">レベル２</option>
								<option value="3">レベル３</option>
							</select>
						</div>
						<input type="submit" value="しらべる"/>
						<input type="reset" value="リセット"/>
					</form>
					<!-- エネルギー計算ここまで -->

					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>
</body>

</html>