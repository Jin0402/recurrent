package servlet;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.ConfirmLogic;
import model.ManagerSlips;
import model.Store;


@WebServlet("/ConfirmOrderServlet")
public class ConfirmOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String forwardPath=null;
		//パラメータ受取り
		request.setCharacterEncoding("utf-8");
		String seat=request.getParameter("seat");


		//席番号がnullなら席選択画面、席番号に値があるならDBより注文情報受け取り結果画面にフォワードパス設定
		if(seat==null) {
			forwardPath="/WEB-INF/jsp/confirmOrder.jsp";
		}else {
			//席番号をリクエストスコープに保存
			request.setAttribute("seat", seat);

			//店頭文字をセッションスコープから取得
			HttpSession session=request.getSession();
			Store store=(Store)session.getAttribute("store");

			//店舗＿席IDを生成
			String store_seatId=store.getStoreInitial()+seat;

			//今日の日付を取得
			LocalDateTime now = LocalDateTime.now();//現在時刻
			DateTimeFormatter Format = DateTimeFormatter.ofPattern("yyyy-MM-dd");//フォーマット指定
			String format = now.format(Format);//現在時刻をフォーマットに適用

			//DBよりテーブル注文情報取得
			ConfirmLogic bo=new ConfirmLogic();
			ManagerSlips result=bo.execute(format, store_seatId);

//			for(int i=0;i<result.size();i++) {
//				System.out.println(result.get(i).getOrderDate());
//				System.out.println(result.get(i).getProductName());
//				System.out.println(result.get(i).getPrice());
//				System.out.println(result.get(i).getCalorie());
//				System.out.println(result.get(i).getQuantity());
//				System.out.println(result.get(i).getItem());
//				System.out.println(result.get(i).getVariety());
//				System.out.println(result.get(i).getOrderType());
//
//			}

			if(result!=null) {
				request.setAttribute("result", result);
			}
			forwardPath="/WEB-INF/jsp/orderTable.jsp";
		}

		//フォワード
		RequestDispatcher dispatcher=request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
