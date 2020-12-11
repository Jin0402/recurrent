package bo;

import dao.OrderDAO;
import model.ManagerSlips;

public class ConfirmLogic {

	public ManagerSlips execute(String format,String store_seatId) {

		OrderDAO dao=new OrderDAO();
		ManagerSlips result=dao.findByOrder(format, store_seatId);
		return result;

	}
}
