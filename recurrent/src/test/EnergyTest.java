package test;

import bo.EnergyLogic;
import model.Energy;

public class EnergyTest {

	public static void main(String[] args) {

		Energy energy = new Energy(1,2,3);
		EnergyLogic lo = new EnergyLogic();

		lo.execute(energy);
		System.out.println(energy.getEnergy());



	}

}
