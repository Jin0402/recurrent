package model;

import java.io.Serializable;

public class ManagerSlip implements Serializable{
	//フィールド
	private String orderDate;
	//private String storeSeatId;
	private String productName;
	private int price;
	private int calorie;
	private int quantity;
	private String item;
	private String variety;
	private String orderType;

	//コンストラクタ
	public ManagerSlip() {}

	public ManagerSlip(String orderDate,String productName,int price,int calorie,int quantity,String item,String variety,String orderType) {

		this.orderDate=orderDate;
		//this.storeSeatId=storeSeatId;
		this.productName=productName;
		this.price=price;
		this.calorie=calorie;
		this.quantity=quantity;
		this.item=item;
		this.variety=variety;
		this.orderType=orderType;
	}

	//ゲッター・セッター
	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
//
//	public String getStoreSeatId() {
//		return storeSeatId;
//	}
//
//	public void setStoreSeatId(String storeSeatId) {
//		this.storeSeatId = storeSeatId;
//	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}





}
