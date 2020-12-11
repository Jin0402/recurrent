<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>

<head>
	<meta charset="UTF-8">
	<title>絞り込み検索画面</title>
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-10 main">
				<!-- カロリー絞り込み画面 -->
				<c:if test="${action=='calorieSelect'}">
					<h2>カロリーを設定してメニューを絞り込みます</h2>
					<p>ご希望のカロリーを選択してください</p>
					<form action="/recurrent/WelcomeServlet" method="post">
						<div>
							<select name="select" required>
								<option value="" disabled selected>カロリーを選択してください</option>
								<option value="100">100</option>
								<option value="200">200</option>
								<option value="300">300</option>
								<option value="400">400</option>
								<option value="500">500</option>
								<option value="600">600</option>
								<option value="700">700</option>
								<option value="800">800</option>
								<option value="900">900</option>
								<option value="1000">1000</option>
								<option value="1100">1100</option>
								<option value="1200">1200</option>
								<option value="1300">1300</option>
								<option value="1400">1400</option>
								<option value="1500">1500</option>
							</select> kcal
						</div>
						<input type="submit" value="絞り込み" />
					</form>
					<a href="/recurrent/EnergyServlet">推定エネルギー量を計算する</a>
				</c:if>
				<!-- カロリー絞り込みここまで -->

				<!-- 価格絞り込み画面 -->
				<c:if test="${action=='priceSelect'}">
					<h1>価格を設定してメニューを絞り込みます</h1>
					<p>ご希望の価格を選択してください</p>
					<form action="/recurrent/WelcomeServlet" method="post">
						<div>
							<select name="select" required>
								<option value="" disabled selected>価格を設定してください</option>
								<option value="500">500</option>
								<option value="1000">1000</option>
								<option value="1500">1500</option>
								<option value="2000">2000</option>
								<option value="2500">2500</option>
								<option value="3000">3000</option>
								<option value="3500">3500</option>
								<option value="4000">4000</option>
								<option value="4500">4500</option>
								<option value="5000">5000</option>
								<option value="5500">5500</option>
								<option value="6000">6000</option>
								<option value="6500">6500</option>
								<option value="7000">7000</option>
								<option value="7500">7500</option>
								<option value="8000">8000</option>
								<option value="8500">8500</option>
								<option value="9000">9000</option>
								<option value="9500">9500</option>
								<option value="10000">10000</option>
								<option value="10500">10500</option>
								<option value="11000">11000</option>
								<option value="11500">11500</option>
								<option value="12000">12000</option>
								<option value="12500">12500</option>
								<option value="13000">13000</option>
								<option value="13500">13500</option>
							</select> 円
						</div>
						<input type="submit" value="絞り込み" />
					</form>
				</c:if>
				<!-- 価格絞り込みここまで -->
			</div>
		</div>
	</div>
</body>
</html>