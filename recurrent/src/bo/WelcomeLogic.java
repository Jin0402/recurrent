package bo;

import dao.WelcomeDAO;
import model.Terminal;

public class WelcomeLogic {

	public boolean execute(Terminal terminal) {
		WelcomeDAO dao = new WelcomeDAO();

		boolean judge = dao.login(terminal);

		return judge;
	}
}
