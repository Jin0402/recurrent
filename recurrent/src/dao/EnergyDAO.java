package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Energy;

public class EnergyDAO {
	// データベース接続に使用する情報
	private final String JDBC_URL = "jdbc:mysql://192.168.10.18:3306/recurrent?characterEncoding=UTF-8&serverTimezone=JST";
	private final String DB_USER = "recurrent";
	private final String DB_PASS = "0000";

	public void confirmEnergy(Energy energy) {
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
		      // エネルギー情報から該当する摂取エネルギーを確認する
		      String sql = "SELECT energy FROM energy WHERE ageId=? AND genderId=? AND levelId=?";
		      PreparedStatement pStmt = conn.prepareStatement(sql);
		      pStmt.setInt(1, energy.getAgeId());
		      pStmt.setInt(2, energy.getGenderId());
		      pStmt.setInt(3, energy.getLevelId());

		      ResultSet rs = pStmt.executeQuery();
		      if(rs.next()) {
		    	  int ingestEnergy = rs.getInt("energy");
		    	  energy.setEnergy(ingestEnergy);
		      }

		} catch (SQLException e) {
			e.printStackTrace();
			}
		}
	}
