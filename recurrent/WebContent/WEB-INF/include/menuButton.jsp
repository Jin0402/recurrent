<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div class="col-sm-2 main">
	<div class="d-none d-md-block">

		<div class="btn-group-vertical"></div>
		<p></p>
		<p></p>
		<p></p>
		<form action="/recurrent/WelcomeServlet" method="post">
			<input type="submit" value="通常メニュー" class="redbutton">
		</form>
		<p></p>
		<a href="/recurrent/CartServlet"><button type="button"
				class="btn-danger">注文カート</button></a>
		<p></p>
		<a href="/recurrent/AssistServlet?action=calorieSelect"><button
				type="button" class="btn btn-dark">カロリー絞り込み</button></a>
		<p></p>
		<a href="/recurrent/AssistServlet?action=priceSelect"><buttontype="button" class="btn btn-success">価格絞り込み</button></a>
		<p></p>
		<a href="/recurrent/PlayServlet"><button type="button"
				class="btn btn-info">ガチャ注文</button></a>
		<p></p>
		<a href="/recurrent/SlipServlet"><button type="button"
				class="btn btn-primary">伝票</button></a>

	</div>
</div>


