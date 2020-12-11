package test;

import dao.MenurDAO;

public class Main {

	public static void main(String[] args) {
		MenurDAO menu = new MenurDAO();

		menu.findAll();

	}

}
