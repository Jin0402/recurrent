package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AssistServlet")
public class AssistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//カロリー絞り込みor価格絞り込みの選択判別のための値（action属性）を受け取りリクエストスコープに保存
		request.setCharacterEncoding("utf-8");
		String action=request.getParameter("action");
		request.setAttribute("action", action);
		//絞り込み画面へフォワード
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/assist.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
