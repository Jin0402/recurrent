package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Products implements Serializable {
	//フィールド
	private ArrayList<Product> products;

	//コンストラクタ
	public Products() {
		this.products = new ArrayList<Product>();
	}
	public Products(ArrayList<Product> products) {
		this.products = products;
	}

	//ゲッター・セッター
	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

}
