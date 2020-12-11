package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.OrderLogic;
import model.Orders;
import model.Terminal;

@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		HttpSession session = request.getSession();
		//注文確定
		{
			OrderLogic orderL = new OrderLogic();
			Terminal terminal = (Terminal) session.getAttribute("terminal");
			Orders orders = (Orders) session.getAttribute("orders");

			orderL.execute(orders, terminal);

			session.removeAttribute("orders");
		}
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/jsp/order.jsp");
		disp.forward(request, response);

	}

}
