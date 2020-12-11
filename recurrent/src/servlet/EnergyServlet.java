package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.EnergyLogic;
import model.Energy;


@WebServlet("/EnergyServlet")
public class EnergyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//エネルギー計算画面へフォワード
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/energy.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//入力内容の引継ぎ(折出)
		{
			//エネルギー計算画面よりフォーム入力値受け取り
			request.setCharacterEncoding("utf-8");
			String gender=request.getParameter("gender");
			String age=request.getParameter("age");
			String level=request.getParameter("level");
			//エネルギー結果画面に移動するためにフォームaction属性を受け取りリクエストスコープに保存
			String action=request.getParameter("action");
			request.setAttribute("action", action);

			//受け取った入力値（文字列）を数値に変換
			int ageId=Integer.parseInt(age);
			int genderId=Integer.parseInt(gender);
			int levelId=Integer.parseInt(level);

			//結果画面に入力値を戻すためにエネルギークラス使用してリクエストスコープに保存
			Energy energy=new Energy(ageId,genderId,levelId);
			request.setAttribute("Energy", energy);
		}

		//必要エネルギー量の取得(滝本)
		{
			int ageId = Integer.parseInt(request.getParameter("age"));
			int genderId = Integer.parseInt(request.getParameter("gender"));
			int levelId = Integer.parseInt(request.getParameter("level"));
			Energy energy = new Energy(ageId, genderId, levelId);

			EnergyLogic energyL = new EnergyLogic();
			energyL.execute(energy);


			request.setAttribute("energy", energy);
		}




		//エネルギー結果画面にフォワード
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/energy.jsp");
		dispatcher.forward(request, response);
	}

}
