package bo;

import java.util.Map;

import dao.MenuDAO;
import model.Products;

public class WelcomeMenuLogic {

	public Map<String, Products> execute() {

		MenuDAO dao = new MenuDAO();

		return dao.findAll();
	}
}
