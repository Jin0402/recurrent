package model;

public class Energy {
	int ageId;
	int genderId;
	int levelId;
	int energy;

	public Energy(int ageId,int genderId,int levelId,int energy) {
		this.ageId=ageId;
		this.genderId=genderId;
		this.levelId=levelId;
		this.energy=energy;
	}
//	仮3つコンストラクタ
	public Energy(int ageId,int genderId,int levelId) {
		this.ageId=ageId;
		this.genderId=genderId;
		this.levelId=levelId;
	}

	public int getAgeId() {
		return ageId;
	}

	public int getGenderId() {
		return genderId;
	}

	public int getLevelId() {
		return levelId;
	}

	public int getEnergy() {
		return energy;
	}
	public void setAgeId(int ageId) {
		this.ageId = ageId;
	}
	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}
	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}




}
