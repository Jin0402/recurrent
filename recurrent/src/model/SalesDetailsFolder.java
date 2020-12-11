package model;

import java.util.ArrayList;
import java.util.Date;

public class SalesDetailsFolder {
	//フィールド
	private Date lowerLimt, upperLimit;
	private String store;
	private ArrayList<SalesDetails> folder;

	//コンストラクタ
	public SalesDetailsFolder() {};
	public SalesDetailsFolder(Date lowerLimit, Date upperLimit, String store) {
		this.lowerLimt = lowerLimit;
		this.upperLimit = upperLimit;
		this.store = store;
	}

	//ゲッター・セッター
	public Date getLowerLimt() {
		return lowerLimt;
	}
	public void setLowerLimt(Date lowerLimt) {
		this.lowerLimt = lowerLimt;
	}
	public Date getUpperLimit() {
		return upperLimit;
	}
	public void setUpperLimit(Date upperLimit) {
		this.upperLimit = upperLimit;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public ArrayList<SalesDetails> getFolder() {
		return folder;
	}
	public void setFolder(ArrayList<SalesDetails> folder) {
		this.folder = folder;
	};

}
