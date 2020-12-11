package model;

import java.io.Serializable;
import java.util.ArrayList;

public class ManagerSlips implements Serializable{
	//フィールド
	private ArrayList<ManagerSlip> managerSlips;

	//コンストラクタ
	public ManagerSlips() {
		this.managerSlips=new ArrayList<ManagerSlip>();
	}


	//ゲッター・セッター
	public ArrayList<ManagerSlip> getManagerSlips() {
		return managerSlips;
	}

	public void setManagerSlips(ArrayList<ManagerSlip> managerSlips) {
		this.managerSlips = managerSlips;
	}


	public ManagerSlip get(int i) {
		return this.managerSlips.get(i);
	}

	public int size() {
		return this.managerSlips.size();
	}
}
