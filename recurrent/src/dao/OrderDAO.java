package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.ManagerSlip;
import model.ManagerSlips;
import model.Order;
import model.Orders;
import model.Slip;
import model.Slips;
import model.Terminal;

public class OrderDAO {
	// データベース接続に使用する情報
		  private final String JDBC_URL = "jdbc:mysql://192.168.10.18:3306/recurrent?characterEncoding=UTF-8&serverTimezone=JST";
		  private final String DB_USER = "recurrent";
		  private final String DB_PASS = "0000";

		  //注文処理-----------------------------------------------------
		  public void registerOreder(Orders orders, Terminal terminal) {
			  // データベースへ接続
			  try (Connection conn = DriverManager.getConnection(
			      JDBC_URL, DB_USER, DB_PASS)) {
				  ArrayList<Order> orderList = orders.getOrders();

				  // SQL文を準備
			      String sql = "INSERT INTO orders SET orderdate=?, orderId=?, orderbranch=?, typecode=?, quantity=?, ordertypeId=?";
			      PreparedStatement pStmt = conn.prepareStatement(sql);

			      int branch = terminal.getOrderBranch();
			      for(int i = 0; i < orderList.size(); i ++) {
				      branch ++;
			    	  terminal.setOrderBranch(branch);
			    	  pStmt.setString(1, orderList.get(i).getOrderDate());
			    	  pStmt.setInt(2, terminal.getOrderId());
			    	  pStmt.setInt(3, terminal.getOrderBranch());
			    	  pStmt.setString(4, orderList.get(i).getTypeCode());
				      pStmt.setInt(5, orderList.get(i).getQuantity());
				      pStmt.setInt(6, orderList.get(i).getOrdertypeId());
				      pStmt.executeUpdate();
			      }

			    } catch (SQLException e) {
			      e.printStackTrace();
			    }
		  }
		  //伝票処理--------------------------------------------------
		  public Slips readOrder(Terminal terminal) {
			  Slips slips = new Slips();
			// データベースへ接続
			  try (Connection conn = DriverManager.getConnection(
			      JDBC_URL, DB_USER, DB_PASS)) {
				  // SQL文を準備
			      String sql = "SELECT productname, quantity, price, calorie FROM orders JOIN product ON orders.typecode = product.typecode WHERE orderId = ?";
			      PreparedStatement pStmt = conn.prepareStatement(sql);

			      pStmt.setInt(1, terminal.getOrderId());
			      //リザルト
			      ResultSet rs = pStmt.executeQuery();
//			      Slip slip = null;

			      while(rs.next()) {
			    	  String productName = rs.getString("productname");
			    	  int quantity = rs.getInt("quantity");
			    	  int price = rs.getInt("price");
			    	  int calorie = rs.getInt("calorie");
			    	  Slip slip = new Slip(productName, price, quantity, calorie);
			    	  slips.getSlips().add(slip);
//			    	  System.out.println(slips.getSlips().get(0).getProduct());
					}
			      return slips;

			    } catch (SQLException e) {
			      e.printStackTrace();

			    }

			  return null;
		  }


		//(管理画面)注文確認--------------------------------------------------
		  public ManagerSlips findByOrder(String format,String store_seatId) {
			  //初期値にnullをセット
			  ManagerSlips managerSlips=null;

			  // データベースへ接続
			  try (Connection conn = DriverManager.getConnection(
			      JDBC_URL, DB_USER, DB_PASS)) {
				  // SQL文を準備
			      String sql = "select orderdate,store_seatId,productname,price,calorie,quantity,item,variety,ordertype from orders join product on orders.typecode=product.typecode join item_variety on product.item_varietyId=item_variety.item_varietyId join item on item_variety.itemId=item.itemId join variety on item_variety.varietyId=variety.varietyId join ordertype on orders.ordertypeId=ordertype.ordertypeId join orderid on orders.orderId=orderid.orderId where orderdate=? and store_seatId=?";
			      PreparedStatement pStmt = conn.prepareStatement(sql);

			      pStmt.setString(1,format);
			      pStmt.setString(2,store_seatId);
			      //リザルト
			      ResultSet rs = pStmt.executeQuery();

			      //表全てをManagerSlipsクラスに格納（NullでなければManagerSlipsクラスをnewする）
		    	  while(rs.next()){
		    		  if(managerSlips==null) {
		    			  managerSlips = new ManagerSlips();
		    		  }
		    		  String orderDate=rs.getString("orderdate");
			    	  String productName = rs.getString("productname");
			    	  int price = rs.getInt("price");
			    	  int calorie = rs.getInt("calorie");
			    	  int quantity = rs.getInt("quantity");
			    	  String item=rs.getNString("item");
			    	  String variety=rs.getString("variety");
			    	  String ordertype=rs.getString("ordertype");


			    	  ManagerSlip managerSlip=new ManagerSlip(orderDate,productName,price,calorie,quantity,item,variety,ordertype);


			    	  managerSlips.getManagerSlips().add(managerSlip);

				  }
			    } catch (SQLException e) {
			      e.printStackTrace();
			      return null;

			    }
			    return managerSlips;
		  }
}
