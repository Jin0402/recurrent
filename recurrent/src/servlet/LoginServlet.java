package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.LoginLogic;
import model.Login;
import model.Store;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//フォワード
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/jsp/confirmlogin.jsp");
		disp.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//リクエストパラメータ―の取得
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");

		//Idから店情報を生成
		Store store=new Store();
		if(id.matches("koube.*")) {
			store.setStoreInitial("k");
			store.setStoreName("神戸店");
			System.out.println("kobe店");
		}else if(id.matches("osaka.*")){
			store.setStoreInitial("o");
			store.setStoreName("大阪店");
		}

		//店情報をセッションスコープに保存
		HttpSession session=request.getSession();
		session.setAttribute("store", store);


		//System.out.println(id);
		//System.out.println(pass);

		//ログイン処理の実行
		Login login = new Login(id,pass);
		LoginLogic bo = new LoginLogic();
		boolean result = bo.execute(login);

		//アカウントがあればトップ画面にフォワード、なければログイン画面にリダイレクト
		if(result) {
			RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
			disp.forward(request, response);

		}else{
			response.sendRedirect("/recurrent/LoginServlet");
		}



	}



}
