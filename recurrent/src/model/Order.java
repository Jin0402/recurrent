package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order implements Serializable {
	//フィールド
//	private Date orderDate;
	private int quantity, price, calorie, ordertypeId, cancel;
	private String orderDate, typeCode, productName, image;

	//コンストラクタ
	public Order() {};
	public Order(String typeCode, String productName, String image, int quantity, int price, int calorie, int ordertypeId) {
		//日付処理
		LocalDateTime now = LocalDateTime.now();//現在時刻
		 DateTimeFormatter Format = DateTimeFormatter.ofPattern("yyyy-MM-dd");//フォーマット指定
		 String format = now.format(Format);//現在時刻をフォーマットに適用
		 this.orderDate = format;
		 this.typeCode = typeCode;
		 this.productName = productName;
		 this.image = image;
		 this.quantity = quantity;
		 this.price = price;
		 this.calorie = calorie;
		 this.ordertypeId = ordertypeId;
	}

	//ゲッター・セッター
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getOrdertypeId() {
		return ordertypeId;
	}
	public void setOrdertypeId(int ordertypeId) {
		this.ordertypeId = ordertypeId;
	}
	public int getCancel() {
		return cancel;
	}
	public void setCancel(int cancel) {
		this.cancel = cancel;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}




}
