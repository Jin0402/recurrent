package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Terminal;

public class WelcomeDAO {
	// データベース接続に使用する情報
		private final String JDBC_URL = "jdbc:mysql://192.168.10.18:3306/recurrent?characterEncoding=UTF-8&serverTimezone=JST";
		private final String DB_USER = "recurrent";
		private final String DB_PASS = "0000";

		public boolean login(Terminal terminal) {
			boolean judge = true;
			try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

				 // 店舗＿席情報を登録して注文IDを作る
			      String sql = "INSERT INTO orderid SET store_seatid=?";
			      PreparedStatement pStmt = conn.prepareStatement(sql);
			      pStmt.setString(1, terminal.getStore_seatId());

			      int rsult = pStmt.executeUpdate();
			      if(rsult == 0) {
			    	  return false;
			      }
			      // 登録した情報から注文IDを取得
			      String sql2 = "SELECT LAST_INSERT_ID() as orderId";
			      PreparedStatement pStmt2 = conn.prepareStatement(sql2);

			      ResultSet rs = pStmt2.executeQuery();
			      if(rs.next()) {
			    	  int id = rs.getInt("orderId");
				      terminal.setOrderId(id);
			      }

			} catch (SQLException e) {
				e.printStackTrace();
				}
			return judge;
			}
}
