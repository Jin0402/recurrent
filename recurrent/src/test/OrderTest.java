package test;

import bo.OrderLogic;
import model.Orders;
import model.Terminal;

public class OrderTest {

	public static void main(String[] args) {
//		MenurDAO menu = new MenurDAO();
//
//		menu.findAll();

//		LocalDateTime now = LocalDateTime.now();
//		 DateTimeFormatter Format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//		 // 日時情報を指定フォーマットの文字列で取得
//		 String format = now.format(Format);
//		 System.out.println(format);

//		System.out.println(now);
		String typeCode = "a-001";
		int quantity = 1;
		int ordertypeId = 1;
//		Order order = new Order(typeCode, quantity, ordertypeId);

		String typeCode2 = "d-001";
		int quantity2 = 1;
		int ordertypeId2 = 1;
//		Order order2 = new Order(typeCode2, quantity2, ordertypeId2);

		Orders orders = new Orders();

//		orders.getOrders().add(order);
//		orders.getOrders().add(order2);

		OrderLogic lo = new OrderLogic();
		Terminal terminal = new Terminal(77);
		lo.execute(orders, terminal);
	}

}
