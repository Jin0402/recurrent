package model;

public class Slip {
	//フィールド
	private String product;
	private int price, quantity, calorie;

	//コンストラクタ
	public Slip() {};
	public Slip(String product, int price, int quantity, int calorie) {
		this.product = product;
		this.price = price;
		this.quantity = quantity;
		this.calorie = calorie;
	}
	//ゲッター・セッター
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
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
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	};

}
