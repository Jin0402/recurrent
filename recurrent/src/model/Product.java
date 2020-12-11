package model;

import java.io.Serializable;

public class Product implements Serializable {
	//フィールド
	private String typeCode, item_varietyId, productName, image;
	private int price, calorie;

	//コンストラクタ
	public Product() {};
	public Product(String typeCode, String item_varietyId, String productName, int price, int calorie, String image) {
		this.typeCode = typeCode;
		this.item_varietyId = item_varietyId;
		this.productName = productName;
		this.price = price;
		this.calorie = calorie;
		this.image = image;

	}
	//ゲッター・セッター
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getItem_varietyId() {
		return item_varietyId;
	}
	public void setItem_varietyId(String item_varietyId) {
		this.item_varietyId = item_varietyId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
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


}
