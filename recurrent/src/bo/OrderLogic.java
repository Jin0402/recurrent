package bo;

import dao.OrderDAO;
import model.Orders;
import model.Terminal;

public class OrderLogic {

	public void execute(Orders orders, Terminal terminal) {
		OrderDAO dao = new OrderDAO();
		dao.registerOreder(orders, terminal);
	}
}
