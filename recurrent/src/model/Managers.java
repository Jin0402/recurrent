package model;

import java.util.ArrayList;

public class Managers {
	//フィールド
	private ArrayList<Manager> managerfolder;

	//コンストラクタ
	public Managers() {}

	//ゲッター・セッター
	public ArrayList<Manager> getManagerfolder() {
		return managerfolder;
	}

	public void setManagerfolder(ArrayList<Manager> managerfolder) {
		this.managerfolder = managerfolder;
	};

}
