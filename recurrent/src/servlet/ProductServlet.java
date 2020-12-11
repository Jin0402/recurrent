package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Product;
import model.Products;


@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//受け取った商品情報を絞り込み、jspに返す(滝本)
		{
			String typeCode = request.getParameter("typeCode");
			String key = request.getParameter("key");
			HttpSession session = request.getSession();
			Map<String, Products> menu = (Map<String, Products>) session.getAttribute("menu");

			ArrayList<Product> list = menu.get(key).getProducts();

			for(int i = 0; i < list.size(); i ++) {
				String comparison = list.get(i).getTypeCode();
				if(typeCode.equals(comparison)) {
					Product product = new Product();
					product.setTypeCode(list.get(i).getTypeCode());
					product.setProductName(list.get(i).getProductName());
					product.setPrice(list.get(i).getPrice());
					product.setCalorie(list.get(i).getCalorie());
					product.setImage(list.get(i).getImage());

					request.setAttribute("product", product);
					break;
				}
			}
			String button = "カートへ";
			request.setAttribute("button", button);

		}

		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/product.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
