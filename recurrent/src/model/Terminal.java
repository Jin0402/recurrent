package model;

import java.io.Serializable;

public class Terminal implements Serializable {
	//フィールド
	int orderId, orderBranch;
	String store_seatId;

	//コンストラクタ
	public Terminal() {
		this.orderBranch = 0;
	};
	public Terminal(int orderId) {
		this.orderId = orderId;
		this.orderBranch = 0;
	}
	public Terminal(String store_seatId) {
		this.store_seatId = store_seatId;
		this.orderBranch = 0;
	}

	//ゲッター・セッター
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderBranch() {
		return orderBranch;
	}
	public void setOrderBranch(int orderBranch) {
		this.orderBranch = orderBranch;
	}
	public String getStore_seatId() {
		return store_seatId;
	}
	public void setStore_seatId(String store_seatId) {
		this.store_seatId = store_seatId;
	}


}
