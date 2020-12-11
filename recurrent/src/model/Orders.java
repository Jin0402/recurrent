package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Orders implements Serializable {
	//フィールド
	ArrayList<Order> orders = new ArrayList<Order>();

	//コンストラクタ
	public Orders() {
		this.orders = new ArrayList<Order>();
	}

	//ゲッター
	public ArrayList<Order> getOrders() {
		return orders;
	};




}
