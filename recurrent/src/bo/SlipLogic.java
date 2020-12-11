package bo;

import dao.OrderDAO;
import model.Slips;
import model.Terminal;

public class SlipLogic {

	public Slips execute(Terminal terminal) {
		OrderDAO dao = new OrderDAO();

		Slips slips = dao.readOrder(terminal);

		return slips;
	}
}
