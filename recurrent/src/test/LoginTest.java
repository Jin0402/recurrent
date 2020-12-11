package test;

import bo.WelcomeLogic;
import model.Terminal;

public class LoginTest {

	public static void main(String[] args) {
		WelcomeLogic logic = new WelcomeLogic();

		Terminal terminal = new Terminal("o16");

		boolean judge = logic.execute(terminal);

		System.out.println(judge);

		System.out.println(terminal.getOrderId());
	}

}
