<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html lang="ja">

<head>
	<%@ include file="../include/include_meta.jsp" %>
	<title>>リ・カレント亭</title>
	<jsp:include page="../include/include_css.jsp" />
</head>
<body>
	<div class="container">
		<%@ include file="../include/include_header.jsp" %>
		<div class="row wrapper">
			<%@ include file="../include/mode_nav.jsp" %>
			<main class="main">
				<p>
					<a href="/recurrent/ProductServlet?typeCode=w-005&key=w">
						<img src="images/wasyoku-005.jpg" class="img-thumbnail" alt="だし巻き" />
						だし巻き卵
					</a>
				</p>
				<p>
					<a href="/recurrent/ProductServlet?typeCode=a-001&key=a">
						<img src="images/sonota-001.jpg" class="img-thumbnail" alt="ごはん" />
						ごはん
					</a>
				</p>
			</main>
		</div>
	</div>
<!--
	<main>
		<div class="row">

			<div class="col-sm-10 main">
				<div class="tab-content" class="menuimg">
					<div id="photo1" class="tab-pane active">


						<a href="/recurrent/ProductServlet"> <img
							src="images/setmenu/setmenu1.jpg" class="img-thumbnail"
							alt="かつ丼セット" />かつ丼セット
						</a> <a href="/recurrent/ProductServlet"> <img
							src="images/setmenu/setmenu2.jpg" class="img-thumbnail"
							alt="カレーセット" />カレーセット
						</a> <img src="images/setmenu/setmenu3.jpg" class="img-thumbnail"
							alt="コロッケセット" />コロッケセット <img src="images/setmenu/setmenu4.jpg"
							class="img-thumbnail" alt="" /> <img
							src="images/setmenu/setmenu5.jpg" class="img-thumbnail" alt="" />

						<img src="images/setmenu/setmenu6.jpg" class="img-thumbnail"
							alt="" /> <img src="images/setmenu/setmenu7.jpg"
							class="img-thumbnail" alt="" /> <img
							src="images/setmenu/setmenu8.jpg" class="img-thumbnail" alt="" />

					</div>


					<div id="photo2" class="tab-pane">

						<img src="images/wasyoku/meniu1.jpg" class="img-thumbnail" alt="" />
						<img src="images/wasyoku/menu10.jpg" class="img-thumbnail" alt="" />
						<img src="images/wasyoku/menu5.jpg" class="img-thumbnail" alt="" />
						<img src="images/wasyoku/menu6.jpg" class="img-thumbnail" alt="" />
						<img src="images/wasyoku/menu7.jpg" class="img-thumbnail" alt="" />

					</div>
					<div id="photo3" class="tab-pane">

						<img src="images/yousyoku/menu2.jpg" class="img-thumbnail" alt="" />
						<img src="images/yousyoku/menu3.jpg" class="img-thumbnail" alt="" />
						<img src="images/yousyoku/menu4.jpg" class="img-thumbnail" alt="" />
						<img src="images/yousyoku/menu8jpg.jpg" class="img-thumbnail"
							alt="" /> <img src="images/yousyoku/menu9.jpg"
							class="img-thumbnail" alt="" />

					</div>
					<div id="photo4" class="tab-pane">
						<img src="images/drink/drink9.jpg" class="img-thumbnail" alt="" />
						<img src="images/drink/drink1.jpg" class="img-thumbnail" alt="" />
						<img src="images/drink/drink2.jpg" class="img-thumbnail" alt="" />
						<img src="images/drink/drink3.jpg" class="img-thumbnail" alt="" />
						<img src="images/drink/drink4.jpg" class="img-thumbnail" alt="" />
						<img src="images/drink/drink5.jpg" class="iimg-thumbnail" alt="" />
						<img src="images/drink/drink6.jpg" class="img-thumbnail" alt="" />
						<img src="images/drink/drink7.jpg" class="img-thumbnail" alt="" />
						<img src="images/drink/drink8.jpg" class="img-thumbnail" alt="" />

					</div>
					<div id="photo5" class="tab-pane">

						<img src="images/sweets/sweet1.jpg" class="img-thumbnail" alt="" />
						<img src="images/sweets/sweet2.jpg" class="img-thumbnail" alt="" />
						<img src="images/sweets/sweet3.jpg" class="img-thumbnail" alt="" />
						<img src="images/sweets/sweet4.jpg" class="iimg-thumbnail" alt="" />

					</div>
					<div id="photo6" class="tab-pane">

						<img src="images/topping/topping1.jpg" class="img-thumbnail"
							alt="" /> <img src="images/topping/topping2.jpg"
							class="iimg-thumbnail" alt="" />

					</div>
				</div>



			</div>

		</div>
	</main>
	</div>
	-->
  <%@ include file="../include/bootstrap_script.jsp" %>
</body>
</html>