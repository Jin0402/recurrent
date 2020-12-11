package model;

import java.util.Date;

public class SalesDetails {
	//フィールド
	private Date salesDate;
	private String store, product, orderType;
	private int price, quantity;

	//コンストラクタ
	public SalesDetails() {};
	public SalesDetails(Date salesDate, String store, String product, int price, int quantity, String orderType) {
		this.salesDate = salesDate;
		this.store = store;
		this.product = product;
		this.price = price;
		this.quantity = quantity;
		this.orderType = orderType;
	}

	//ゲッター・セッター
	public Date getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	};

}
