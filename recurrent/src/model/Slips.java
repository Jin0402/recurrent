package model;

import java.util.ArrayList;

public class Slips {
	//フィールド
	private ArrayList<Slip> slips;

	//コンストラクタ
	public Slips() {
		this.slips = new ArrayList<Slip>();
	}

	//ゲッター・セッター
	public ArrayList<Slip> getSlips() {
		return slips;
	}

	public void setSlips(ArrayList<Slip> slips) {
		this.slips = slips;
	};


}
