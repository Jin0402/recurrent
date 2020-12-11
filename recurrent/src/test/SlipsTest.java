package test;

import bo.SlipLogic;
import model.Slips;
import model.Terminal;

public class SlipsTest {

	public static void main(String[] args) {

		Terminal terminal = new Terminal(50);

		SlipLogic lo = new SlipLogic();

		Slips slips = lo.execute(terminal);

		System.out.println(slips.getSlips().get(0).getProduct());

//		String menu = slips.getSlips().get(0).getProduct();
//
//		System.out.println(menu);
	}

}
