package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Login;
import model.Manager;

public class ManagerDAO {
	// データベース接続に使用する情報
		  private final String JDBC_URL = "jdbc:mysql://192.168.10.18:3306/recurrent?characterEncoding=UTF-8&serverTimezone=JST";
		  private final String DB_USER = "recurrent";
		  private final String DB_PASS = "0000";

//		  public void findAll() {
		  public Manager findByLogin(Login login) {

			Manager manager = null;

		    // データベースへ接続
		    try (Connection conn = DriverManager.getConnection(
		        JDBC_URL, DB_USER, DB_PASS)) {

		      // SELECT文を準備
		      String sql = "SELECT managers_Id,pass FROM manager where managers_id=? and pass=?";
		      PreparedStatement pStmt = conn.prepareStatement(sql);
		      pStmt.setString(1, login.getId());
		      pStmt.setString(2, login.getPass());

		      // SELECTを実行し、結果表を取得
		      ResultSet rs = pStmt.executeQuery();

		      // 一致したユーザーが存在した場合
		      // そのユーザーを表すAccountインスタンスを生成
		      if (rs.next()) {
		        // 結果表からデータを取得
//		        String code = rs.getString("typecode");
		        String id = rs.getString("managers_Id");
		        String pass = rs.getString("pass");
		        manager = new Manager(id,pass);
		      }
		    } catch (SQLException e) {
		      e.printStackTrace();
		      return null;
		    }
		    return manager;
		  }

	}



