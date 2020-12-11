package bo;

import dao.ManagerDAO;
import model.Login;
import model.Manager;

public class LoginLogic {

		public boolean execute(Login login) {

			ManagerDAO dao = new ManagerDAO();
			Manager manager = dao.findByLogin(login);
			return manager !=null;


		}

}
