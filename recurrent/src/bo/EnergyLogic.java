package bo;

import dao.EnergyDAO;
import model.Energy;

public class EnergyLogic {

	public void execute(Energy energy) {

		EnergyDAO dao = new EnergyDAO();

		dao.confirmEnergy(energy);
	}
}
