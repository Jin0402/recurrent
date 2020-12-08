package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Orders;
import model.Product;

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//カート内数量変更用ページへフォワードする
		{
			String ordersNum = request.getParameter("ordersNum");
			if(!(ordersNum == null)) {
				HttpSession session = request.getSession();
				Orders orders = (Orders) session.getAttribute("orders");

				int num = Integer.parseInt(ordersNum);

				String typeCode = orders.getOrders().get(num).getTypeCode();
				String productName = orders.getOrders().get(num).getProductName();
				String image = orders.getOrders().get(num).getImage();
				int price = orders.getOrders().get(num).getPrice();
				int calorie = orders.getOrders().get(num).getCalorie();
				Integer quantity = orders.getOrders().get(num).getQuantity();

				Product product = new Product();
				product.setTypeCode(typeCode);
				product.setProductName(productName);
				product.setPrice(price);
				product.setCalorie(calorie);
				product.setImage(image);
				request.setAttribute("product", product);
				request.setAttribute("quantity", quantity);
				String button = "数量変更";

				request.setAttribute("product", product);
				request.setAttribute("button", button);
				//フォワード
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/product.jsp?action=alter");
				dispatcher.forward(request, response);
			}
		}

		//フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/cart.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//action属性受け取り
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		//action属性がnullの時メインメニュー画面へリダイレクト、action属性=alterの時カート数量変更/商品削除画面へフォワード
		if (action.equals("confirm")) {
			String button = "数量変更";
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/top.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("confirm")) {
			//数量変更の決定の場合の、注文カート画面の数量変更にフォワード（action属性渡す）
			String quantityChange = request.getParameter("quantityChange");
			String delate = request.getParameter("delate");
			if (quantityChange != null) {
				String quantity = request.getParameter("quantity");
				System.out.println(quantity);
			} else if (delate != null) {
				String quantity = request.getParameter("quantity");
				System.out.println(quantity);
			}


			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/cart.jsp");
			dispatcher.forward(request, response);
		}

	}

}
