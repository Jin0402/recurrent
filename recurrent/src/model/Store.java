package model;

import java.io.Serializable;

public class Store implements Serializable{
	//フィールド
	private String storeInitial;
	private String storeName;


	//コンストラクタ
	public Store(String storeInitial,String storeName) {
		this.storeInitial=storeInitial;
		this.storeName=storeName;
	}

	public Store() {
	}


	//ゲッター・セッター
	public String getStoreInitial() {
		return storeInitial;
	}

	public String getStoreName() {
		return storeName;
	}


	public void setStoreInitial(String storeInitial) {
		this.storeInitial = storeInitial;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}


}
