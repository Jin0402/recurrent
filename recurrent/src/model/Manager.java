package model;

public class Manager {
	//フィールド
	private String id, pass, name;

	//コンストラクタ
	public Manager() {};
	public Manager(String id, String pass) {
		this.id = id;
		this.pass = pass;
	}

	//ゲッター・セッター
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	};
}
